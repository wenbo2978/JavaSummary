package com.thread.reentrantLock;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        BoundedQueue<Integer> queue = new BoundedQueue<>(5);
        Runnable producer = () -> {
            for(int i = 0; i < 20; i ++){
                try {
                    queue.put(i);
                    System.out.println(Thread.currentThread().getName() + " produced " + i);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable consumer = () -> {
            for (int i = 0; i < 20; i ++){
                try {
                    Integer item = queue.take();
                    System.out.println(Thread.currentThread().getName() + " consumed " + i);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(producer, "Producer-1");
        //Thread t2 = new Thread(producer, "Producer-2");
        Thread t3 = new Thread(consumer, "Consumer-1");
        //Thread t4 = new Thread(consumer, "Consumer-2");
        t1.start();
        //t2.start();
        t3.start();
        //t4.start();

        t1.join();
        //t2.join();
        t3.join();
        //t4.join();

    }
}
