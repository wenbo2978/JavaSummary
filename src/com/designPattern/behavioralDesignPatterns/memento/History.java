package com.designPattern.behavioralDesignPatterns.memento;

import java.util.Deque;
import java.util.LinkedList;

public class History {
    private final Deque<TextMemento> undoStack = new LinkedList<>();
    public void save(TextMemento memento) {
        this.undoStack.push(memento);
    }

    public TextMemento undo() {
        return undoStack.getLast();
    }
}
