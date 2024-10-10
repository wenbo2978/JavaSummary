package com.mockInterview.interview01;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        Book book1 = new Book("1", "Dragon Ball");
        Book book2 = new Book("2", "American History");
        Book book3 = new Book("3", "Bible");

        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.setLastPage(book1, 5);
        library1.setActiveBookId(book1);


        Library library2 = new Library();
        library2.addBook(book1);
        library2.addBook(book2);
        library2.setLastPage(book1, 3);
        library2.setActiveBookId(book1);

        System.out.println(library1.displayActiveContent());

        System.out.println(library2.displayActiveContent());
    }
}

class Book{
    String id;
    String title;
    List<String> pageList;

    public Book(String id, String title){
        this.id = id;
        this.title = title;
        this.pageList = new ArrayList<>();
        for(int i = 0; i < 10; i ++){
            pageList.add(String.format("Page: %d of %s", i + 1, title));
        }
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPage(int index){
        if(index == 0)
            return "show book cover";
        return this.pageList.get(index - 1);
    }
}

class UserBook{
    private Book book;
    private int lastPage;

    public UserBook(Book book){
        this.book = book;
        this.lastPage = 0;
    }

    public void setLastPage(int page){
        this.lastPage = page;
    }

    public String getPage(){
        return this.book.getPage(this.lastPage);
    }


}

class Library{
    private String activeBookId = null;
    private Map<String, UserBook> bookLists;

    public Library(){
        this.bookLists = new HashMap<>();
    }

    public void addBook(Book book){
        if(this.bookLists.containsKey(book.getId()))
            return;
        UserBook userBook = new UserBook(book);
        this.bookLists.put(book.getId(), userBook);
    }

    public void removeBook(Book book){
        if(this.bookLists.containsKey(book.getId()))
            return;
        UserBook userBook = new UserBook(book);
        this.bookLists.put(book.getId(), userBook);
    }

    public void setLastPage(Book book, int page){
        if(this.bookLists.containsKey(book.getId())){
            this.bookLists.get(book.getId()).setLastPage(page);
        }
    }

    public void setActiveBookId(Book book){
        this.activeBookId = book.getId();
    }

    public String displayActiveContent(){
        if(this.activeBookId == null)
            return "Please set active book first";
        else
            return this.bookLists.get(this.activeBookId).getPage();
    }



}
