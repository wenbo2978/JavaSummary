package com.mockInterview.interview03;

public class Book {
    String id;
    String title;
    String author;
    int publicationYear;
    boolean borrowed;

    public Book() {
    }

    public Book(String id, String title, String author, int publicationYear, boolean borrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = borrowed;
    }

    public boolean borrowBook(){
        if(!this.borrowed){
            this.borrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook(){
        this.borrowed = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", borrowed=" + borrowed +
                '}';
    }

    public String displayBook(){
        return this.toString();
    }

}
