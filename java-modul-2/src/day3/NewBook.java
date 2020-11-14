package day3;

public class NewBook {
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
        System.out.println("Publisher: " + publicher);
        System.out.println("Year of the book: " + year);
        System.out.println("Pages number: " + numberOfPages);
        System.out.println("My bookmark" + bookmark);
        System.out.println("Country was published in " + countryOfBook);
        System.out.println("The rating of this book is " + bookRate);
        System.out.println("The language of this book is + " + language);
        System.out.println("The price for the book is " + price);
        System.out.println("The book weight is " + bookWeight);
    }

    public NewBook(String bookName, int weight) {
        this.nameOfBook = bookName;
        this.bookWeight = weight;
    }

    public NewBook(String publicher, String language, int price) {
        this.publicher = publicher;
        this.language = language;
        this.price = price;
    }

    public NewBook(String nameOfBook, String language, String publicher) {
        this.nameOfBook = nameOfBook;
        this.language = language;
        this.publicher = publicher;
    }

    public NewBook(int rate, String language, int weight, String country, int bookmark) {
        this.bookRate = rate;
        this.language = language;
        this.bookWeight = weight;
        this.countryOfBook = country;
        this.bookmark = bookmark;
    }

    public NewBook(String language) {
        this.language = language;
    }

    public NewBook(int weight, int bookmark, int price) {
        this.bookWeight = weight;
        this.bookmark = bookmark;
        this.price = price;
    }

    public NewBook(String publicher, String name) {
        this.publicher = publicher;
        this.nameOfBook = name;
    }

    public NewBook(int price) {
        this.price = price;
    }

    public NewBook(String publicher, String language, int price, int weight) {
        this.publicher = publicher;
        this.language = language;
        this.price = price;
        this.bookWeight = weight;
    }

    public NewBook(String nameOfBook, String publicher, String language, int price, int bookmark, int bookWeight, String countryOfBook,
                   int year, int numberOfPages, double bookRate) {
        this.nameOfBook = nameOfBook;
        this.publicher = publicher;
        this.language = language;
        this.price = price;
        this.bookmark = bookmark;
        this.bookWeight = bookWeight;
        this.countryOfBook = countryOfBook;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.bookRate = bookRate;
    }

    public void setName(String name) {
        this.nameOfBook = name;
    }

    public String getName() {
        return this.nameOfBook;
    }

    public void setCountry(String country) {
        this.countryOfBook = country;
    }

    public String getCountry() {
        return this.countryOfBook;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setWeight(int weight) {
        this.bookWeight = weight;
    }

    public int getWeight() {
        return this.bookWeight;
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }

    public int getBookmark() {
        return this.bookmark;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setPublisher(String publicher) {
        this.publicher = publicher;
    }

    public String getPublisher() {
        return this.publicher;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

class TestBook {
    public static void main(String[] args) {
        NewBook b1 = new NewBook("Angels and Demons", 256);
        NewBook b2 = new NewBook("Dan Brown", "English", 25);
        NewBook b3 = new NewBook("War and peace", "Russian", "Tolstoy");
        NewBook b4 = new NewBook(5, "English", 25, "England", 15);
        NewBook b5 = new NewBook("Russian");
        NewBook b6 = new NewBook(25, 15, 40);
        NewBook b7 = new NewBook("Tolstoy", "War and Peace");
        NewBook b8 = new NewBook(20);
        NewBook b9 = new NewBook("Dan Brown", "English", 40, 25);
        NewBook b10 = new NewBook("Angels and Demons", "Dan Brown", "English",
                40, 15, 20, "England", 2000, 356, 10);
        NewBook[] bookArray = new NewBook[]{b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};

        System.out.println(b9.language);
        System.out.println(b7.getPublisher());
        System.out.println(b10.year + " " + b9.publicher);
        System.out.println(b5.getCountry());
        System.out.println(b1.getName());
        b1.setName("War and Peace");
        System.out.println(b1.getName());
        printArray(bookArray);
        b1.displayInfo();
        b1.isRead();
        b5.available();
    }

    private static void printArray(NewBook[] arr) {
        for (NewBook book : arr) {
            book.displayInfo();
        }
    }
}
