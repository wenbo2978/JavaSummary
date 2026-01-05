package com.designPattern.behavioralDesignPatterns.visitor;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        FolderElement folder = new FolderElement(List.of(
                new FileElement(200),
                new FileElement(300)
        ));

        FolderElement root = new FolderElement(List.of(
                new FileElement(500),
                new FileElement(600),
                folder
        ));

        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        root.accept(visitor);
        System.out.println(visitor.getTotalSize());
    }
}
