package com.designPattern.observer;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList observers = new ArrayList();

    public void attach(MyObserver observer){
        observers.add(observer);
    }

    public void detach(MyObserver observer){
        observers.remove(observer);
    }

    public abstract void cry();
}
