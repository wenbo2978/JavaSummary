package com.thread;

public class MyThread extends Thread{

    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}
