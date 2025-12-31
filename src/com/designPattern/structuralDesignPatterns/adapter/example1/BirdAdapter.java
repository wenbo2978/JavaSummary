package com.designPattern.structuralDesignPatterns.adapter.example1;

public class BirdAdapter extends Bird implements Robot {
    @Override
    public void move() {
        System.out.print("Robot mock: ");
        super.fly();
    }

    @Override
    public void cry() {
        System.out.print("Robot mock: ");
        super.tweedle();
    }
}
