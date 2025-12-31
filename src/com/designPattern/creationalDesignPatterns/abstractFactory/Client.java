package com.designPattern.creationalDesignPatterns.abstractFactory;

public class Client {
    public static void main(String[] args) {
        EFactory eFactory = new HaierFactory();
        Television television;
        AirConditioner airConditioner;
        television = eFactory.produceTelevision();
        airConditioner = eFactory.produecAirConditioner();
        television.paly();
        airConditioner.changeTemperature();
    }
}
