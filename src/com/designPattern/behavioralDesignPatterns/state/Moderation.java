package com.designPattern.behavioralDesignPatterns.state;

public class Moderation implements DocumentState{
    @Override
    public void publish(Document doc) {
        System.out.println("Publish Document!!");
        doc.setDoc(new Published());
    }
}
