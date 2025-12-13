package com.collectionFramework.mapExample;

import java.awt.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentMapExample {

    public void ConcurrentHashMapTest() throws InterruptedException {
        ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            try{
                for(int i = 0; i < 5; i ++){
                    concurrentMap.put(i, i * i);
                    Thread.sleep(10);
                }

                for(int i = 0; i < 5; i ++){
                    concurrentMap.put(i, i * 3);
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            try {
                for(int i = 0; i < 5; i ++){
                    System.out.println(concurrentMap.getOrDefault(i, -1));
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        t2.start();
        t1.start();
        t1.join();
        t2.join();
    }

    public void ConcurrentSkipListMapTest() throws InterruptedException {
        ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentSkipListMap<>();
        Thread t1 = new Thread(() -> {
            try{
                for(int i = 0; i < 50; i ++){
                    concurrentMap.put(i, i * i);
                    Thread.sleep(10);
                }

                for(int i = 0; i < 50; i ++){
                    concurrentMap.put(i, i * 3);
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            try {
                for(int i = 0; i < 50; i ++){
                    System.out.println(concurrentMap.getOrDefault(i, -1));
                    Thread.sleep(10);
                }
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }, "Thread 2");

        t2.start();
        t1.start();
        t1.join();
        t2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        ConcurrentMapExample concurrentMapExample = new ConcurrentMapExample();
        //concurrentMapExample.ConcurrentHashMapTest();
        concurrentMapExample.ConcurrentSkipListMapTest();
    }
}
