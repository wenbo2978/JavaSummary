package com.designPattern.creationalDesignPatterns.factoryMethod;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("HisenseTV Factory produce Hisense TV...");
        return new HisenseTV();
    }
}
