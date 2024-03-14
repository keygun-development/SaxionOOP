package nl.saxion.opp.week4.exercise6;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<DVD> dvds = new ArrayList<>();
    private ArrayList<LibraryItem> lendOut = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }

    public void printCollection(boolean withKeys) {
        int key = 0;
        for (Book book : books) {
            if (withKeys) {
                System.out.println(key + ") " + book);
            } else {
                System.out.println(book);
            }
            key++;
        }
        for (DVD dvd : dvds) {
            if (withKeys) {
                System.out.println(key + ") " + dvd);
            } else {
                System.out.println(dvd);
            }
            key++;
        }
        System.out.println("=== END OF LIST ===");
    }

    public void lendOut(int index) {
        if (index < books.size()) {
            books.get(index).lendOut();
            lendOut.add(books.get(index));
        } else {
            dvds.get(index - books.size()).lendOut();
            lendOut.add(dvds.get(index - books.size()));
        }
    }

    public void takeBack(int index) {
        lendOut.get(index).takeBack();
        lendOut.remove(index);
    }

    public ArrayList<LibraryItem> getLendOut() {
        return lendOut;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<DVD> getDVDs() {
        return dvds;
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public DVD getDVD(int index) {
        return dvds.get(index);
    }
}
