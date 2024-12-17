package com.sbu.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintNumber {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    static volatile boolean flag = false;
    Object object = new Object();

    public void printVersion1(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(atomicInteger.get() <= 200){
                    if(flag){
                        System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                        flag = false;
                    }

                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(atomicInteger.get() <= 200){
                    if(flag == false){
                        System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                        flag = true;
                    }

                }
            }
        }).start();

    }

    public void printVersion2(){
        new Thread(() -> {
            while(atomicInteger.get() <= 200){
                synchronized (object){
                    try{
                        object.notify();
                        System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                        object.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        }).start();

        new Thread(() -> {
            while(atomicInteger.get() <= 200){
                synchronized (object){
                    try{
                        object.notify();
                        System.out.println(Thread.currentThread().getName() + ": " + atomicInteger.getAndIncrement());
                        object.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

    public static void main(String[] args){
        PrintNumber printNumber = new PrintNumber();
        printNumber.printVersion2();
    }
}
