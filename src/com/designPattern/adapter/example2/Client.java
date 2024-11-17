package com.designPattern.adapter.example2;

public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Robot robotDog = new DogAdapter(dog);
        robotDog.cry();
        robotDog.move();

        Bird bird = new Bird();
        Robot robotBird = new BirdAdapter(bird);
        robotBird.cry();
        robotBird.move();
    }
}
