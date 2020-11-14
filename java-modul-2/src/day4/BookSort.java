package day4;

import day3.NewBook;

import java.util.Arrays;

public class BookSort {
    String nameOfBook;
    String publicher;
    int year;
    int numberOfPages;
    int bookmark;
    String countryOfBook;
    double bookRate;
    String language;
    int price;
    int bookWeight;

    void available() {
        System.out.println("The book is available");
    }

    void isRead() {
        System.out.println("The book is read at the moment");
    }

    void displayInfo() {
        System.out.println("Name: " + nameOfBook);
        System.out.println("Year of the book: " + year);
        System.out.println("Country: was published in " + countryOfBook);

    }

    public BookSort(String bookName, String countryOfBook, int year) {
        this.nameOfBook = bookName;
        this.countryOfBook = countryOfBook;
        this.year = year;
    }

}

class TestBook {
    public static void main(String[] args) {
        BookSort b1 = new BookSort("Angels and Demons", "England", 2000);
        BookSort b2 = new BookSort("Inferno", "England", 2002);
        BookSort b3 = new BookSort("War and peace", "Russia", 1965);
        BookSort b4 = new BookSort("Code da Vinchi", "England", 2001);
        BookSort b5 = new BookSort("Palata 6", "Russia", 1932);
        BookSort b6 = new BookSort("Master and Margharita", "Russia", 1940);
        BookSort b7 = new BookSort("12 chairs", "Russia", 1928);
        BookSort b8 = new BookSort("Idiot", "Russia", 1868);
        BookSort b9 = new BookSort("Captain daughter", "Russia", 1836);
        BookSort b10 = new BookSort("Jane Air", "England", 1847);
        BookSort[] bookArray = new BookSort[]{b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};


        insertSort(bookArray);
        printArray(bookArray);

    }

    private static void insertSort(BookSort[] arr) {
        for (int i = 1; i < arr.length; i++) {
            BookSort element = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index].year > element.year) {
                arr[index + 1] = arr[index];
                index = index - 1;
            }
            arr[index + 1] = element;
        }
    }

    public static void printArray(BookSort[] arr) {
        for (BookSort element : arr) {
            element.displayInfo();
        }
    }
}