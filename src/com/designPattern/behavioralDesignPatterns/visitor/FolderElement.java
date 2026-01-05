package com.designPattern.behavioralDesignPatterns.visitor;

import java.util.List;

public class FolderElement implements FileSystemElement{

    private final List<FileSystemElement> children;

    public FolderElement(List<FileSystemElement> children) {
        this.children = children;
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
