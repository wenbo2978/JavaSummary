package com.thread.printInOrder;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution2 {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
           while (atomicInteger.get() <= 100){
               if(!flag){
                   System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                   flag = true;
               }
           }
        });
        Thread t2 = new Thread(() -> {
            while (atomicInteger.get() <= 100){
                if(flag){
                    System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                    flag = false;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
