package com.designPattern.behavioralDesignPatterns.memento;

public class TextMemento {
    private final String content;

    public TextMemento(String content) {
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

}
