package com.designPattern.creationalDesignPatterns.simpleFactory;

public class HaierTV implements TV {
    @Override
    public void play() {
        System.out.println("Haier TV is playing...");
    }
}
