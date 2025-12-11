package com.thread.reentrantLock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;
    private final ReentrantLock lock = new ReentrantLock();

    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    public BoundedQueue(int capacity){
        this.capacity = capacity;
    }

    public void put(T item)throws InterruptedException{
        lock.lock();
        try {
            while (queue.size() == capacity){
                notFull.await();
            }
            queue.add(item);
            notEmpty.signal();

        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException{
        lock.lock();
        try {
            while (queue.isEmpty()){
                notEmpty.await();
            }
            T item = queue.poll();
            notFull.signal();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
