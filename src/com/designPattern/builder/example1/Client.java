package com.designPattern.builder.example1;

public class Client {

    public static void main(String[] args){
        Car car = new Car.CarBuilder()
                .setModel("Tesla Model S")
                .setEngine("Electric")
                .setDoors(4)
                .setSunroof(true)
                .setGPS(true)
                .build();
        System.out.println(car);
    }
}
