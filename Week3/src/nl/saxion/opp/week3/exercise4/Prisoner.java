package nl.saxion.opp.week3.exercise4;

public class Prisoner {
    private String name;
    private String crime;

    public Prisoner(String name, String crime) {
        this.name = name;
        this.crime = crime;
    }

    public String getName() {
        return name;
    }

    public String getCrime() {
        return crime;
    }
}
