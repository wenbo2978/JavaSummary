package com.designPattern.behavioralDesignPatterns.mediator;

public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new ChatUser(chatRoom, "Alice");
        User bob   = new ChatUser(chatRoom, "Bob");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);

        alice.send("Hello Bob!");
    }
}
