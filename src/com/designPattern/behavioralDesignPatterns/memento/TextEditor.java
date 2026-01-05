package com.designPattern.behavioralDesignPatterns.memento;

public class TextEditor {
    private String content;

    void write(String text) {
        this.content = text;
    }

    TextMemento save() {
        return new TextMemento(content);
    }

    void restore(TextMemento memento) {
        this.content = memento.getContent();
    }

    String getContent() {
        return content;
    }
}
