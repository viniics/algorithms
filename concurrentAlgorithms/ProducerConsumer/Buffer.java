package concurrentAlgorithms.ProducerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
    private final int[] buffer;
    private final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();
    int currPutIndex, currTakeIndex, currentSize = 0;

    public Buffer(int size) {
        this.buffer = new int[size];
    }

    public void put(int value) throws InterruptedException {
        lock.lock();
        try {
            while (currentSize == buffer.length) {
                notFull.await();
            }
            buffer[currPutIndex] = value;
            currPutIndex++;
            if (currPutIndex == buffer.length) {
                currPutIndex = 0;
            }
            currentSize++;
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public int get() throws InterruptedException {
        lock.lock();
        try {
            while (currentSize == 0) {
                notEmpty.await();
            }
            int value = buffer[currTakeIndex];
            currTakeIndex++;
            if (currTakeIndex == buffer.length) {
                currTakeIndex = 0;
            }
            currentSize--;
            notFull.signalAll();
            return value;
        } finally {
            lock.unlock();
        }

    }
}
