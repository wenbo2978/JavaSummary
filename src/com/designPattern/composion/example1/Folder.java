package com.designPattern.composion.example1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent{
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileComponent component) {
        components.add(component);
    }

    public void removeComponent(FileComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : components) {
            component.showDetails();  // Recursive call for each component
        }
    }
}
