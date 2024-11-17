package com.designPattern.observer;

public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("Mouse runs...");
    }
}
