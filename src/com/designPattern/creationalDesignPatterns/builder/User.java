package com.designPattern.creationalDesignPatterns.builder;

public class User {

    private final String name;
    private final int age;
    private final String gender;

    private User (UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.gender = userBuilder.gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class UserBuilder{

        private String name;
        private int age;
        private String gender;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public User buildUser(){
            return new User(this);
        }
    }
}
