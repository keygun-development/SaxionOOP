package nl.saxion.opp.exercise0;

public class Drink extends Item {
    private int amountMl;
    private boolean containsAlcohol;

    public Drink(String name, double price, int amountMl, boolean containsAlcohol) {
        super(name, price);
        this.amountMl = amountMl;
        this.containsAlcohol = containsAlcohol;
    }

    public Drink(String name, double price, int amountMl) {
        this(name, price, amountMl, false);
    }

    public boolean containsAlcohol() {
        return this.containsAlcohol;
    }

    public int getAmountMl() {
        return this.amountMl;
    }

    public String toString() {
        return super.toString() + "[alcoholic: " + this.containsAlcohol + ", amount: " + this.amountMl + "ml]";
    }
}
