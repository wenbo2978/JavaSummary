package com.designPattern.behavioralDesignPatterns.interpreter;

import java.util.Set;

public class Context {
    private final Set<String> data;

    public Context(Set<String> data) {
        this.data = data;
    }

    public boolean contains(String value){
        return data.contains(value);
    }


}
