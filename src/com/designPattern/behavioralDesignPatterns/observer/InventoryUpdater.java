package com.designPattern.behavioralDesignPatterns.observer;

public class InventoryUpdater implements Observer{
    @Override
    public void update(String orderId) {
        System.out.println("Inventory updated for order " + orderId);
    }
}
