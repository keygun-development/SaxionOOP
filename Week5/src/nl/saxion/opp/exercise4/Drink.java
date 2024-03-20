package nl.saxion.opp.exercise4;

public class Drink extends Product {
    private int ml;
    private int sugar;
    private boolean cafeine;

    public Drink(String name, double price, int ml, int sugar, boolean cafeine) {
        super(name, price);
        this.ml = ml;
        this.sugar = sugar;
        this.cafeine = cafeine;
    }
}
