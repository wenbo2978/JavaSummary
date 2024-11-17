package com.designPattern.decorator.example1;

public class Client {

    public static void main(String[] args){
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        // Add sugar to the coffee
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }
}
