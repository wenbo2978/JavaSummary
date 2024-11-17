package com.designPattern.bridge;

public abstract class AbstractMessage {
    protected MessageMethod impl;
    public AbstractMessage(MessageMethod impl){
        this.impl=impl;
    }
    public abstract void sendMessage(String message,String user);
}
