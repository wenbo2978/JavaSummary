package com.designPattern.decorator.example1;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
