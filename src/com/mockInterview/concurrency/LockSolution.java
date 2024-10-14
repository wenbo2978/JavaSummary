package com.mockInterview.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSolution {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment(){
        lock.lock();
        try{
            count ++;
        }finally {
            lock.unlock();
        }
    }

    public int getCount(){
        lock.lock();
        try{
            return count;
        }finally {
            lock.unlock();
        }
    }
}
