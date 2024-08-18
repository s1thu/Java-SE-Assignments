package com.library.model;

public class Book {

    private String title;
    private String subTitle;
    private static int bookCount = 0;

    public Book(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
        addBookCount();
    }

    private static void addBookCount() {
        bookCount = bookCount + 1;
    }

    public Book(String title) {
        this.title = title;
        addBookCount();
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void displayBookInfo(){
        System.out.println("Book Title :" + this.title);
        if (subTitle == null){
            return;
        }
        System.out.println("Book Sub Title :" + this.subTitle);
    }


}
