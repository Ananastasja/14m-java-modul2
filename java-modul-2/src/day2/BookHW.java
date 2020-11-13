package day2;

public class BookHW {
    String nameOfBook;
    String publicher;
    int year;
    int numberOfPages;

    void available() {
        System.out.println("The book is available");
    }

    void isRead () {
        System.out.println("The book is read at the moment");
    }

    void displayInfo() {
        System.out.println("Name: " + nameOfBook);
        System.out.println("Publisher: " + publicher);
        System.out.println("Year of the book: " + year);
        System.out.println("Pages number: " + numberOfPages);
    }

    public BookHW(String Bookname, String publisherName, int bookYear, int pages) {
        nameOfBook = Bookname;
        publicher = publisherName;
        year = bookYear;
        numberOfPages = pages;
    }
}

class BookTest {
    public static void main(String[] args) {
        BookHW info = new BookHW("Angels and Demons", "Dan Brown", 2000, 365);
        info.displayInfo();
    }
}
