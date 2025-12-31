package com.designPattern.creationalDesignPatterns.abstractFactory;

public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produecAirConditioner() {
        return new TCLAirConditioner();
    }
}
