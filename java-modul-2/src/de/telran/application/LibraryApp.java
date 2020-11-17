package de.telran.application;

import de.telran.dao.Library;
import de.telran.data.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 =  new Book("Harry Potter",
                "Joan Rollings",
                435,
                2010);
        Book book2 = new Book("Winnie the Pooh",
                "Alex Milan",
                256,
                1957);
        Book book3 = new Book("Sherlock Holmes",
                "Artur Conan Doyle",
                388,
                1892);
        Book book4 = new Book("Little Prince",
                "Antonie de Saint-Exupery",
                200,
                1943);

        Library myLib = new Library(100);
       /* System.out.println("Size " + myLib.getSize());
        myLib.addBook(book1);
        System.out.println("Size " + myLib.getSize());
        myLib.display();
        myLib.addBook(book2);//sout - true/false
        myLib.addBook(book3);
        myLib.addBook(book4);
        myLib.display();
        myLib.deleteBook(book2);
        System.out.println("Deleted");
        myLib.display();
        System.out.println(myLib.getSize());
        myLib.displayDeletedBook();*/
        myLib.insertionSort();
        myLib.display();
        System.out.println(myLib.search(book1));


    }
}
