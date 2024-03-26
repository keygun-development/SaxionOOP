package nl.saxion.opp.week6.exercise3;

enum breed {
    AFRICAN,
    PERSIAN
}

public class Lion extends Animal {
    private breed breed;

    public Lion(String gender, breed breed) {
        super(gender, "Lion");
        this.breed = breed;
    }

    public String toString() {
        return super.toString() + " of breed " + breed;
    }
}
