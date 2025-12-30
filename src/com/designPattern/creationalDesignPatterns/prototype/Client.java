package com.designPattern.creationalDesignPatterns.prototype;

public class Client {

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument("Sky", new MetaData("WW"));
        Prototype<?> cloneDoc = textDocument.copy();
        System.out.println(cloneDoc.toString());
    }
}
