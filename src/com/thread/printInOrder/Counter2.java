package com.thread.printInOrder;

import java.util.concurrent.locks.ReentrantLock;

public class Counter2 {

    public static int value = 0;

    public static void main(String[] args) throws InterruptedException{
        ReentrantLock lock = new ReentrantLock();
        Runnable task = () -> {
            while (true){
                lock.lock();
                try{
                   if(value >= 100)
                       break;
                   System.out.println(Thread.currentThread().getName() + ": " + ++value);
                }finally{
                    lock.unlock();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
