package com.thread.producer_consumer_problem;

import java.util.ArrayDeque;

public class Main {
    public static ArrayDeque<Cookie> cookies = new ArrayDeque<>();
    public static final int MAX_COOKIES = 5;

    public static void main(String[] args) {
        // create producer and consumer
        Baker baker = new Baker();
        Cashier cashier = new Cashier();

        // creates threads that produce and consume
        Thread thread1 = new Thread(() -> {
            try {
                for(int i = 0; i < 5; i++) {
                    baker.produce(new Cookie());
                }

            } catch (InterruptedException e) {
                System.out.println("Producer interrupted!");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                for(int i = 0; i < 5; i++) {
                    cashier.consume();
                }

            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted!");
            }
        });

        // start threads
        thread1.start();
        thread2.start();
    }
}
