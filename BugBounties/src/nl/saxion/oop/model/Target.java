package nl.saxion.oop.model;

public class Target {
    private String type;
    private String name;
    private String city;

    public Target(String type, String name, String city) {
        this.type = type;
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }
}
