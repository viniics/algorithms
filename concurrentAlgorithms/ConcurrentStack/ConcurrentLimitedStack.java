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

    public Integer getValue() {
        return value;
    }
}

public class ConcurrentLimitedStack {
    Node head;
    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock writeLock = lock.writeLock();
    Lock readLock = lock.readLock();
    private final int MAX_SIZE = 100;

    public ConcurrentLimitedStack() {
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

    public Integer pop() {
        writeLock.lock();
        try {
            if (head == null) {
                return null;
            }
            Integer value = head.value;
            head = head.next;
            return value;
        } finally {
            writeLock.unlock();
        }
    }

    public void push(Integer value) {
        writeLock.lock();
        try {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } finally {
            writeLock.unlock();
        }
    }
}
