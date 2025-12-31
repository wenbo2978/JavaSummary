package com.designPattern.behavioralDesignPatterns.observer;

public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.attach(new EmailNotifier());
        orderService.attach(new InventoryUpdater());
        orderService.placeOrder("KHF-1359");
    }
}
