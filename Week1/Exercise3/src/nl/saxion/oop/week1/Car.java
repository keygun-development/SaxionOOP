package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Car {
    private String brand;
    private String numberPlate;
    private double tankSizeInLitres;
    private double currentFuel;
    private final int fuelConsumption;
    private int kilometersDriven = 0;

    public Car(String brand, String numberPlate, int tankSizeInLitres, int fuelConsumption) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.tankSizeInLitres = tankSizeInLitres;
        this.currentFuel = tankSizeInLitres;
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public double getTankSizeInLitres() {
        return tankSizeInLitres;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getKilometersDriven() {
        return kilometersDriven;
    }

    public void drive(int km) {
        if (km > this.currentFuel * fuelConsumption) {
            SaxionApp.printLine("You don't have enough fuel to drive that far!", Color.RED);
            return;
        }
        this.kilometersDriven += km;
        this.currentFuel -= (double) km / fuelConsumption;
    }

    public void fuel(int litres) {
        if (this.currentFuel + litres > this.tankSizeInLitres) {
            SaxionApp.printLine("You can't refuel that much!", Color.RED);
            return;
        }
        this.currentFuel += litres;
    }

    @Override
    public String toString() {
        return getBrand() + "(" + getNumberPlate() + "), " + getCurrentFuel() + " litres (" + getCurrentFuel() / getTankSizeInLitres() * 100 + "%) " + getKilometersDriven() + " km";
    }
}
