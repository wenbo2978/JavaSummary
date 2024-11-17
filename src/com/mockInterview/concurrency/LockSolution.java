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

    public static void main(String[] args) throws InterruptedException {
        LockSolution lockSolution = new LockSolution();
        Thread[] threads = new Thread[100];
        for(int i = 0; i < 100; i ++){
            int k = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j ++){
                        ///atomicTest.increment();
                        lockSolution.increment();
                    }
                }
            });
        }
        for(int i = 0; i < 100; i ++){
            threads[i].start();
        }
        for(int i = 0; i < 100; i ++){
            threads[i].join();
        }

        System.out.println(lockSolution.getCount());
    }
}
