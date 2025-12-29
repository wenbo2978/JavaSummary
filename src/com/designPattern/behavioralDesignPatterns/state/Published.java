package com.designPattern.behavioralDesignPatterns.state;

public class Published implements DocumentState{
    @Override
    public void publish(Document doc) {
        System.out.println("Already Published!!");
    }
}
