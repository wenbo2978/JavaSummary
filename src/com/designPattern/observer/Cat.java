package com.designPattern.observer;

public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("Cat cries!!!!");
        System.out.println("------------");
        for(Object object:observers){
            ((MyObserver)object).response();
        }
    }
}
