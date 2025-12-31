package com.designPattern.structuralDesignPatterns.decorator.example1;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost(){
        return this.decoratedCoffee.cost();
    }
}
