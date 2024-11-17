package com.designPattern.adapter.example2;

public class BirdAdapter implements Robot {
    private Bird bird;

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void move() {
        System.out.print("Robot mock: ");
        this.bird.fly();
    }

    @Override
    public void cry() {
        System.out.print("Robot mock: ");
        this.bird.tweedle();
    }
}
