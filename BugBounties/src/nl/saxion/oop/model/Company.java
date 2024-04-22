package nl.saxion.oop.model;

public class Company extends Target {
    private String taxNumber;

    public Company(String name, String city, String taxNumber) {
        super("company", name, city);
        this.taxNumber = taxNumber;
    }
}
