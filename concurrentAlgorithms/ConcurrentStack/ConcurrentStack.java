package concurrentAlgorithms.ConcurrentStack;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Node {
    Integer value;

    Node next;

    Node(Integer value) {
        this.value = value;
    }
}

public class ConcurrentStack {
    Node head;
    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock writeLock = lock.writeLock();
    Lock readLock = lock.readLock();
    public ConcurrentStack() {
        head = null;
    }

    public boolean isEmpty() {
        readLock.lock();
        try {
            return head == null;
        } finally {
            readLock.unlock();
        }
    }
}
