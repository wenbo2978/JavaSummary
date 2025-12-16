package com.collectionFramework.listExample;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("WW");
        vector.add("DD");
        vector.add("TT");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
