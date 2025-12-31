package com.designPattern.structuralDesignPatterns.bridge;

public class Email implements MessageMethod {
    @Override
    public void send(String message, String user) {
        System.out.println("Send Msg By Email To "+user+":"+message);
    }
}
