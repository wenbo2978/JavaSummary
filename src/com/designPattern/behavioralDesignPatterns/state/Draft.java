package com.designPattern.behavioralDesignPatterns.state;

public class Draft implements DocumentState{
    @Override
    public void publish(Document doc) {
        System.out.println("Moving to Moderation!!");
        doc.setDoc(new Moderation());
    }
}
