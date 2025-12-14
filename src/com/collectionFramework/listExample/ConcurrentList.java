package com.collectionFramework.listExample;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentList {

    public static void CopyOnWriteTest() throws InterruptedException {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        Runnable task = () -> {
            for (int i = 0; i < 10; i ++){
                copyOnWriteArrayList.add(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        for(Integer v : copyOnWriteArrayList){
            System.out.println(v);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteTest();
    }
}
