package com.designPattern.bridge;

public class UrgentMessage extends AbstractMessage {

    public UrgentMessage(MessageMethod impl){
        super(impl);
    }

    @Override
    public void sendMessage(String message, String user) {
        message = "Urgent!!!!"+message;
        impl.send(message,user);
    }
}
