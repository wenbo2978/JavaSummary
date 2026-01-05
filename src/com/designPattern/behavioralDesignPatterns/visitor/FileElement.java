package com.designPattern.behavioralDesignPatterns.visitor;

public class FileElement implements FileSystemElement{
    private final long size;

    public FileElement(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
