package nl.saxion.oop.week2;

import java.util.ArrayList;

public class Bookcase {
    private int maxCapacity;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Bookcase(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getBookCount() {
        return books.size();
    }

    public int getMaximumCapacity() {
        return maxCapacity;
    }

    public int getTotalNumberOfPages() {
        int totalNumberOfPages = 0;
        for (Book book : books) {
            totalNumberOfPages += book.getNumberOfPages();
        }
        return totalNumberOfPages;
    }

    public Author findAuthorByBookTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book.getAuthor();
            }
        }
        return null;
    }

    public ArrayList<Book> getBooksFromAuthor(String authorName) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equals(authorName)) {
                books.add(book);
            }
        }
        return books;
    }

    public void addBook(Book book) {
        if (books.size() < maxCapacity) {
            books.add(book);
        } else {
            throw new IllegalStateException("Bookcase is full");
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String toString() {
        return "Bookcase{" +
                "maxCapacity=" + maxCapacity +
                ", size=" + books.size() +
                '}';
    }
}
