package com.designPattern.behavioralDesignPatterns.observer;

public class EmailNotifier implements Observer{
    @Override
    public void update(String orderId) {
        System.out.println("Email sent for order " + orderId);
    }
}
