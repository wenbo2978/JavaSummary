package com.designPattern.behavioralDesignPatterns.template;

public class Client {
    public static void main(String[] args) {
        DataProcessor processor = new CSVProcessor();
        processor.process();
    }
}
