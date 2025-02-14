package com.oop.abstract_vs_interface;

public class Solution {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("JJ");

        System.out.println(dog.getName());

        dog.fly();

        dog.sleep();

        RobotAdapter.info();
    }
}
