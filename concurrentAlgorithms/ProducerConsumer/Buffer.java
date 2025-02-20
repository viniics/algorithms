package concurrentAlgorithms.ProducerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private final int[] buffer;
    private final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    int inPos, takePos, count = 0;

    public Buffer(int size) {
        this.buffer = new int[size];
    }

    public void put(int value) throws InterruptedException {
        lock.lock();
        try {
            while (count == buffer.length) {
                notFull.await();
            }
            buffer[inPos] = value;
            inPos++;
            if (inPos == buffer.length) {
                inPos = 0;
            }
            count++;
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public int get() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            int value = buffer[takePos];
            takePos++;
            if (takePos == buffer.length) {
                takePos = 0;
            }
            count--;
            notFull.signalAll();
            return value;
        } finally {
            lock.unlock();
        }

    }
}
