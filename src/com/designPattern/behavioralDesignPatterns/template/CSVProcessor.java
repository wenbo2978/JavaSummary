package com.designPattern.behavioralDesignPatterns.template;

public class CSVProcessor extends DataProcessor{
    @Override
    void readData() {
        System.out.println("Read CSV Data");
    }

    @Override
    void processData() {
        System.out.println("Process CSV Data");
    }

}
