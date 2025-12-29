package com.designPattern.behavioralDesignPatterns.template;

public abstract class DataProcessor {

    abstract void readData();
    abstract void processData();
    public void writeData(){
        System.out.println("Data output!!");
    }

    public void process(){
        readData();
        processData();
        writeData();
    }
}
