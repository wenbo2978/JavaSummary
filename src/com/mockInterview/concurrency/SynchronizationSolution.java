package com.mockInterview.concurrency;

public class SynchronizationSolution {
    private int count = 0;

    public synchronized void increment(){
        count ++;
    }

    public synchronized int getCount(){
        return count;
    }
}
