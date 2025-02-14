package com.oop.abstract_vs_interface;

public class Dog extends Animal implements RobotAdapter{

    @Override
    public void move() {
        System.out.println("Dog is moving!!");
    }

    @Override
    public void fly() {
        System.out.println("Dog fly!!");
    }

//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
}
