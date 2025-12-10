package com.thread.printInOrder;

public class Counter {

    private int value;

    public void increase(){
        value ++;
    }

    public int getValue(){
        return value;
    }

    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 50; i ++){
                synchronized (counter){
                    counter.increase();
                    System.out.println(Thread.currentThread().getName() + ": " + counter.getValue());
                }

            }
        }, "Thread 0");
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 50; i ++){
                synchronized (counter){
                    counter.increase();
                    System.out.println(Thread.currentThread().getName() + ": " + counter.getValue());
                }

            }
        }, "Thread 1");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
