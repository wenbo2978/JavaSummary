package com.thread.printInOrder;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution1 {

    static AtomicInteger currV = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            while(true){
                int v = currV.incrementAndGet();
                if(v > 100)
                    break;
                System.out.println(Thread.currentThread().getName() + ": " + v);

            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
