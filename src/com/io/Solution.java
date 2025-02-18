package com.io;

import java.io.*;

public class Solution {

    private void serializationTest(){
        Person person = new Person("Alice", "M", 25);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myDir/person.ser"))) {
            oos.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private void deserializationTest(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myDir/person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + person.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.serializationTest();

        solution.deserializationTest();
    }
}
