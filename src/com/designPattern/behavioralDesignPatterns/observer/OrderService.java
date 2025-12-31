package com.designPattern.behavioralDesignPatterns.observer;

public class OrderService extends Subject{

    public void placeOrder(String orderId){
        System.out.println("Order placed: " + orderId);
        notifyObservers(orderId);
    }
}
