package com.designPattern.creationalDesignPatterns.factoryMethod;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("HaierTV Factory produce Haier TV...");
        return new HaierTV();
    }
}
