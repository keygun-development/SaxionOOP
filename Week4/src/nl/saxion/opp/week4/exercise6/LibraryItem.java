package nl.saxion.opp.week4.exercise6;

public class LibraryItem {
    private String barcode;
    private String title;
    private boolean available = true;

    public LibraryItem(String barcode, String title) {
        this.barcode = barcode;
        this.title = title;
    }

    @Override
    public String toString() {
        return title+" ("+barcode+")";
    }

    public void lendOut() {
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    public void takeBack() {
        available = true;
    }
}
