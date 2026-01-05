package com.designPattern.behavioralDesignPatterns.visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
