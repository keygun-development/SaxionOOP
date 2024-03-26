package nl.saxion.opp.week6.exercise3;

public class Elephant extends Animal {
    private int weight;

    public Elephant(String gender, int weight) {
        super(gender, "Elephant");
        this.weight = weight;
    }

    public String toString() {
        return super.toString() + " of weight " + weight;
    }
}
