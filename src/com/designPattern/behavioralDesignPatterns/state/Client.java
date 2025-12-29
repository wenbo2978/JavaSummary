package com.designPattern.behavioralDesignPatterns.state;

public class Client {

    public static void main(String[] args) {
        Document document = new Document();
        document.publish();
        document.publish();
        document.publish();
    }
}
