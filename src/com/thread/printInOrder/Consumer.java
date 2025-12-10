package com.thread.printInOrder;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer {
    final static int flag = -1;
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        new Thread(() -> {
            for(int i = 1; i <= 100; i ++){
                queue.add(i);
            }
            for(int i = 0 ;i < 2; i ++)
                queue.add(-1);
        }).start();
        Runnable consumer = () -> {
          while (true){
              try {
                  Integer v = queue.take();
                  if(v == flag)
                      break;
                  System.out.println(Thread.currentThread().getName() + ": " + v);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }

          }
        };

        Thread t1 = new Thread(consumer, "Thread 0");
        Thread t2 = new Thread(consumer, "Thread 1");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
