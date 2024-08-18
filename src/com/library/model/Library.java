package com.library.model;

public class Library {

    private Book[] books;

   public Library(){
         this.books = new Book[0];
   }

   public void addBook(Book book){
         Book[] newBooks = new Book[this.books.length + 1];
         for(int i = 0; i < this.books.length; i++){
              newBooks[i] = this.books[i];
         }
         newBooks[this.books.length] = book;
         this.books = newBooks;
   }

   public void displayAllBooks(){
       for (Book book : this.books) {
           book.displayBookInfo();
           System.out.println();
       }
   }
}
