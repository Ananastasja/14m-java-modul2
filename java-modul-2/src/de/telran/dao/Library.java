package de.telran.dao;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }

        return false;
    }

    public boolean deleteBook(Book kniga) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(kniga)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayDeletedBook() {
        System.out.println(books[size]);
    }

    public void insertionSort() {

        for (int i = 1; i < size; i++) {
            int location = i - 1;
            Book temp = books[i];
            while (location >= 0 && temp.getAuthor().compareTo(books[location].getAuthor()) < 0) {
                books[location + 1] = books[location];
                location = location - 1;
            }
            books[location + 1] = temp;
        }
    }

    public int search(Book book) {
        int bookPlace = -1;
        int lowerIndex = 0;
        int highIndex = books.length - 1;
        while (lowerIndex <= highIndex) {
            int middleIndex = (lowerIndex + highIndex) / 2;
            if (book.getDateOfIssue() == books[middleIndex].getDateOfIssue()) {
                bookPlace = middleIndex;
            } else if (book.getDateOfIssue() < books[middleIndex].getDateOfIssue()) {
                highIndex = middleIndex - 1;
            }else if (book.getDateOfIssue()>books[middleIndex].getDateOfIssue()){
                lowerIndex=middleIndex+1;
            }
        }return bookPlace;
    }
}
