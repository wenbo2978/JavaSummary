package com.thread.printInOrder;

import java.util.concurrent.Semaphore;

public class Counter3 {

    static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);

        Thread t1 = new Thread(() -> {
            while (true){
                try {
                    s1.acquire();
                    if(value > 100){
                        s2.release();
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + ++value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    s2.release();
                }

            }
        });
        Thread t2 = new Thread(() -> {
            while (true){
                try {
                    s2.acquire();
                    if(value > 100){
                        s1.release();
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + ++value);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    s1.release();
                }

            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
