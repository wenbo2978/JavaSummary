package com.designPattern.creationalDesignPatterns.prototype;

public class MetaData {

    private String author;

    public MetaData(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "MetaData{" +
                "author='" + author + '\'' +
                '}';
    }
}
