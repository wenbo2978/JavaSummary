package com.designPattern.behavioralDesignPatterns.visitor;

public interface FileSystemVisitor {
    void visit(FileElement file);
    void visit(FolderElement folder);
}
