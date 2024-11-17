package com.designPattern.bridge;

public class SpecialMessage extends AbstractMessage {

    public SpecialMessage(MessageMethod impl){
        super(impl);
    }
    @Override
    public void sendMessage(String message, String user) {
        message = "Special!!!!"+message;
        impl.send(message,user);
    }

}
