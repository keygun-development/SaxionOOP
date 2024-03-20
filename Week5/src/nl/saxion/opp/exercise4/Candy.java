package nl.saxion.opp.exercise4;

public class Candy extends Product {
    private int weight;

    public Candy(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }
}
