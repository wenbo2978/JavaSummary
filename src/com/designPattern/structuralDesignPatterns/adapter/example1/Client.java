package com.designPattern.structuralDesignPatterns.adapter.example1;

public class Client {
    public static void main(String[] args) {
        Robot robot = new DogAdapter();
        robot.cry();
        robot.move();

        Robot robotb = new BirdAdapter();
        robotb.cry();
        robotb.move();
    }
}
