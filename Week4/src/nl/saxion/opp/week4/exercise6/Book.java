package nl.saxion.opp.week4.exercise6;

public class Book extends LibraryItem {
    private String isbn;
    private String author;

    public Book(String barcode, String title, String isbn, String author) {
        super(barcode, title);
        this.isbn = isbn;
        this.author = author;
    }

    public String toString()
    {
        return (!isAvailable() ? "* " : "") + "- Book - "+super.toString()+", isbn: "+isbn+", author: "+author;
    }
}
