package com.designPattern.structuralDesignPatterns.bridge;

public class MobileMessage implements MessageMethod {
    @Override
    public void send(String message, String user) {
        System.out.println("Send Msg By Mobile to "+user+":"+message);
    }
}
