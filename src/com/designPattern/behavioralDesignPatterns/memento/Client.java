package com.designPattern.behavioralDesignPatterns.memento;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello");
        history.save(editor.save());

        editor.write("Hello World");
        editor.restore(history.undo());

        System.out.println(editor.getContent()); // Hello
    }
}
