package com.oop.abstract_vs_interface;

public abstract class Animal extends SuperAnimal{

    public String name;

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    public abstract void move();
}
