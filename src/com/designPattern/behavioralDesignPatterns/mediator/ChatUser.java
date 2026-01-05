package com.designPattern.behavioralDesignPatterns.mediator;

public class ChatUser extends User{

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
