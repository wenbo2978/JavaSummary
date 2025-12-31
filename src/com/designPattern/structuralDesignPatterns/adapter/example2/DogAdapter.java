package com.designPattern.structuralDesignPatterns.adapter.example2;

public class DogAdapter implements Robot {

    private Dog dog;

    public DogAdapter(Dog dog){
        this.dog = dog;
    }

    @Override
    public void move() {
        System.out.print("Robot mock: ");
        this.dog.run();
    }

    @Override
    public void cry() {
        System.out.print("Robot mock: ");
        this.dog.wang();
    }
}
