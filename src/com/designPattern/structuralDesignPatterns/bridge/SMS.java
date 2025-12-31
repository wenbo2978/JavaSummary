package com.designPattern.structuralDesignPatterns.bridge;

public class SMS implements MessageMethod {
    @Override
    public void send(String message, String user) {
        System.out.println("Send Msg By SMS to "+user+":"+message);
    }
}
