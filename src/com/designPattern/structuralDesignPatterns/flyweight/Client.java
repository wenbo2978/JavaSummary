package com.designPattern.structuralDesignPatterns.flyweight;

public class Client {

    public static void main(String[] args) {
        CharacterFlyweight a1 = CharacterFactory.get('c', "Arial", 12);
        a1.draw(10, 52);
        CharacterFlyweight a2 = CharacterFactory.get('c', "Arial", 12);
        a2.draw(55, 63);
        System.out.println(a1 == a2);
    }
}
