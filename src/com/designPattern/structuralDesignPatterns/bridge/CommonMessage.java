package com.designPattern.structuralDesignPatterns.bridge;

public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageMethod impl){
        super(impl);
    }
    @Override
    public void sendMessage(String message, String user) {
        impl.send(message,user);
    }
}
