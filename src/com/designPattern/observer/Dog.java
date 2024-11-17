package com.designPattern.observer;

public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("Dog barks...");
    }
}
