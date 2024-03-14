package nl.saxion.opp.week4.exercise6;

public class DVD extends LibraryItem {
    private String rating;
    private String year;

    public DVD(String barcode, String title, String rating, String year) {
        super(barcode, title);
        this.rating = rating;
        this.year = year;
    }

    public String toString()
    {
        return "- DVD - "+super.toString()+", rating: "+rating+", year: "+year;
    }
}
