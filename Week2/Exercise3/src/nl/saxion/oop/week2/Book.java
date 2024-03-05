package nl.saxion.oop.week2;

public class Book {
    private String title;
    private String isbn;
    private int numberOfPages;
    private Author author;

    public Book(String isbn, String title, int numberOfPages, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author=" + author +
                '}';
    }
}
