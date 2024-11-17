package com.designPattern.builder.example2;

public class Client {
    public static void main(String[] args) {
        // Using the outer builder to construct a Car object
        CarBuilder carBuilder = new CarBuilder();
        Car car = carBuilder
                .setModel("Tesla Model 3")
                .setEngine("Electric")
                .setDoors(4)
                .setSunroof(true)
                .setGPS(true)
                .build();  // Creates the Car object

        System.out.println(car);
    }
}
