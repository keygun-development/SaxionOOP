package nl.saxion.oop.week2;

public class Car {
    private String brand;
    private String license;

    public Car(String brand, String license) {
        this.brand = brand;
        this.license = license;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicense() {
        return license;
    }
}
