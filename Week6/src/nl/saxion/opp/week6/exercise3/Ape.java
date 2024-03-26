package nl.saxion.opp.week6.exercise3;

public class Ape extends Animal {
    private String breed;

    public Ape(String gender, String breed) {
        super(gender, "Ape");
        this.breed = breed;
    }

    public String toString() {
        return super.toString() + " of breed " + breed;
    }
}
