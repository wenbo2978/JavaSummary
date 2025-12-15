package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {

    private void runThread1(){
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();
    }

    private void runThread2(){
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.toString());
                }
            }
        });

        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
    }

    private void executorExample(){
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 5; i ++){
            service.execute(new Task(i));
        }

        service.shutdown();
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        //solution.runThread1();
        //solution.runThread2();
        solution.executorExample();
    }
}
