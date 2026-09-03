package oop.assigment_problems;

/** A book's title and price stored together in one object. */
class Book {
    String title;
    double price;
}

/**
 * Week 3 - Assignment Problem L1 : Simple Book Record Class.
 */
public class BookRecord {

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Clean Code";
        book.price = 650.0;

        System.out.println("Title: " + book.title + " | Price: Rs " + book.price);
    }
}
