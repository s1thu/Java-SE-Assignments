package com.library.main;

import com.library.model.Book;
import com.library.model.Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Book getBookFromUser() throws  IOException{
        System.out.println("Enter details for a new book ====>");
        System.out.print("Title:");
        String title = br.readLine();
        System.out.print("Sub Title(or press Enter to skip) :");
        String subTitle = br.readLine();

        if (subTitle.isEmpty()){
            Book book = new Book(title);
            return book;
        }
        Book book = new Book(title, subTitle);
        return book;
    }

    public static void main(String[] args) throws IOException {
        Library library = new Library();
        String flag = "";

        do{
            Book book = getBookFromUser();
            library.addBook(book);
            System.out.print("Do you want to add more books? (yes/no):");
            flag = br.readLine();
        }while (!flag.equalsIgnoreCase("no"));

        library.displayAllBooks();
        System.out.println("Total number of book created :" + Book.getBookCount());

    }
}
