package nl.saxion.opp.week4.exercise0;

public class House extends Building {
    private String owner;
    private boolean hasGarage;
    private int price;

    public House(String address, String zipCode, String city, int area, String owner, boolean hasGarage, int price) {
        super(address, zipCode, city, area);
        this.owner = owner;
        this.hasGarage = hasGarage;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return "House of " + getOwner() + " " + (hasGarage() ? "with" : "without") + " garage, price: EUR " + getPrice() + ", " + super.toString();
    }
}
