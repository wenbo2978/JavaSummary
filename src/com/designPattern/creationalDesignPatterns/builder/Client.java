package com.designPattern.creationalDesignPatterns.builder;

public class Client {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("WW")
                .setAge(28)
                .setGender("male")
                .buildUser();
        System.out.println(user.toString());
    }
}
