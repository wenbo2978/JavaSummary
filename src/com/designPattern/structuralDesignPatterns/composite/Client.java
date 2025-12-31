package com.designPattern.structuralDesignPatterns.composite;

public class Client {
    public static void main(String[] args) {
        // Create individual files
        FileComponent file1 = new File("Document1.txt");
        FileComponent file2 = new File("Image1.png");
        FileComponent file3 = new File("Video1.mp4");

        // Create folders and add files to them
        Folder folder1 = new Folder("My Documents");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Media");
        folder2.addComponent(file3);

        // Create a root folder and add folders to it
        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Show details of the root folder
        rootFolder.showDetails();
    }
}
