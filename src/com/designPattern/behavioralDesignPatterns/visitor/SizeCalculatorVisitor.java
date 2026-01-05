package com.designPattern.behavioralDesignPatterns.visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    private long totalSize = 0;



    @Override
    public void visit(FileElement file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(FolderElement folder) {
        for(FileSystemElement file : folder.getChildren()){
            file.accept(this);
        }
    }

    public long getTotalSize(){
        return this.totalSize;
    }
}
