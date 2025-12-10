package com.thread.printInOrder;

public class Printer {

    int value = 0;
    boolean myTurn = true;
    synchronized void print(boolean turn) throws InterruptedException {
        while (value < 100){
            while (turn != myTurn)
                wait();
            System.out.println(Thread.currentThread().getName() + ": " + ++value);
            myTurn =! myTurn;
            notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread t1 = new Thread(() -> {
            try {
                printer.print(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 0");

        Thread t2 = new Thread(() -> {
            try {
                printer.print(false);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
