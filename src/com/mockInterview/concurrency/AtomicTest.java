package com.mockInterview.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    private AtomicInteger count = new AtomicInteger(0);
    //private int count = 0;

    public void increment(){
        count.getAndIncrement();
    }

    public int getCount(){
        return count.get();
    }
    public static void main(String[] args) throws InterruptedException{
        AtomicTest atomicTest = new AtomicTest();
        Thread[] threads = new Thread[100];
        for(int i = 0; i < 100; i ++){
            int k = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j ++){
                        ///atomicTest.increment();
                        atomicTest.increment();
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

        System.out.println(atomicTest.getCount());
    }
}
