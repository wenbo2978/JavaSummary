package com.thread;

public class Task implements Runnable{

    private int id;

    public Task(){

    }

    public Task(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Executing Task " + id);
    }
}
