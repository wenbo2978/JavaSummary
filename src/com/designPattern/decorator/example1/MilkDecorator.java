package com.designPattern.decorator.example1;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.50;  // Adding the cost of milk
    }
}
