package com.designPattern.structuralDesignPatterns.adapter.example1;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void move() {
        System.out.print("Robot mock: ");
        super.run();
    }

    @Override
    public void cry() {
        System.out.print("Robot mock: ");
        super.wang();
    }
}
