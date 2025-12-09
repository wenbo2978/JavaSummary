package com.thread.executeInOrder;

public class Solution {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread1 is finished!!"));

        Thread t2 = new Thread(() -> {
            try {
                t1.join();
                System.out.println("Thread2 is finished!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        t2.start();
        t1.start();

    }
}
