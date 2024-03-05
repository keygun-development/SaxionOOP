package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> listOfCars = new ArrayList<Car>();

    public Dealership() {

    }

    public void addCar(Car car) {
        try {
            for (Car c : listOfCars) {
                if (c.getLicense().equals(car.getLicense())) {
                    throw new IllegalArgumentException();
                }
            }
            listOfCars.add(car);
        } catch (IllegalArgumentException e) {
            SaxionApp.printLine("License plate already exists in the system.");
        }
    }

    public int getNrOfCarsByBrand(String brand) {
        int count = 0;
        for (Car car : listOfCars) {
            if (car.getBrand().equals(brand)) {
                count++;
            }
        }
        return count;
    }
}
