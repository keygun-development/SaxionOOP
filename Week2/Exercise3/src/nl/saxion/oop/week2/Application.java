package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.time.LocalDate;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Create 2 bookcases
        Bookcase bookcase1 = new Bookcase(10);
        Bookcase bookcase2 = new Bookcase(5);

        // Create authors
        Author jkRowling = new Author("J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author sCollins = new Author("Suzanne Collins", LocalDate.of(1962, 8, 10));

        // Add books to bookcase 1
        bookcase1.addBook(new Book("1", "Harry Potter and the Philospher's Stone", 223, jkRowling));
        bookcase1.addBook(new Book("2", "Harry Potter and the Chamber of Secrets", 251, jkRowling));
        bookcase1.addBook(new Book("3", "Harry Potter and the Prisoner of Azkaban", 317, jkRowling));
        bookcase1.addBook(new Book("4", "Harry Potter and the Goblet of Fire", 636, jkRowling));
        bookcase1.addBook(new Book("100", "The Hunger Games", 374, sCollins));
        bookcase1.addBook(new Book("101", "Catching Fire", 391, sCollins));

        // Add books to bookcase 2
        bookcase2.addBook(new Book("5", "Harry Potter and the Order of the Phoenix", 766, jkRowling));
        bookcase2.addBook(new Book("6", "Harry Potter and the Half-Blood Prince", 607, jkRowling));
        bookcase2.addBook(new Book("7", "Harry Potter and the Deathly Hallows", 607, jkRowling));
        bookcase1.addBook(new Book("102", "Mockingjay", 390, sCollins));

        // Print statistics
        SaxionApp.printLine("Bookcase 1: " + bookcase1);
        SaxionApp.printLine("Bookcase 2: " + bookcase2);

        // Get all books from one author:
        SaxionApp.printLine("Books from J.K. Rowling in first bookcase:");
        for (Book book : bookcase1.getBooksFromAuthor("J.K. Rowling")) {
            SaxionApp.printLine(book);
        }
    }
}