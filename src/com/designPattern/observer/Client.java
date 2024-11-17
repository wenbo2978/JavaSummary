package com.designPattern.observer;

public class Client {
    public static void main(String[] args) {
        MyObserver ob1,ob2,ob3;
        MySubject sub = new Cat();
        ob1 = new Mouse();
        ob2 = new Mouse();
        ob3 = new Dog();
        sub.attach(ob1);
        sub.attach(ob2);
        sub.attach(ob3);

        sub.cry();
    }
}
