package nl.saxion.oop.model;

public class Charity extends Target {
    private String registrationNumber;

    public Charity(String name, String city, String registrationNumber) {
        super("charity", name, city);
        this.registrationNumber = registrationNumber;
    }
}
