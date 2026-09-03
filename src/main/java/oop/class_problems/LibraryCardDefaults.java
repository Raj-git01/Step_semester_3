package oop.class_problems;

/** A library card whose fields are read before anything is assigned to them. */
class LibraryCard {
    String holderName;
    int booksIssued;
    boolean active;
}

/**
 * Week 3 - Class Problem L3 : Reading Java's Default Field Values.
 * An unset String field is null, not an empty string.
 */
public class LibraryCardDefaults {

    public static void main(String[] args) {
        LibraryCard card = new LibraryCard();

        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}
