package nl.saxion.opp.week6.exercise3;

public class Giraffe extends Animal {
    private int length;

    public Giraffe(String gender, int length) {
        super(gender, "Giraffe");
        this.length = length;
    }

    public String toString() {
        return super.toString() + " of length " + length;
    }
}
