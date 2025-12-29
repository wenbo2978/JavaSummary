package com.designPattern.behavioralDesignPatterns.template;

public class JSONProcessor extends DataProcessor{
    @Override
    void readData() {
        System.out.println("Read JSON Data");
    }

    @Override
    void processData() {
        System.out.println("Process JSON Data");
    }
}
