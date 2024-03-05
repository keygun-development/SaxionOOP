package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;
    private int numberOfSeatsInUse = 0;

    public TrainCompartment(int numberOfSeats, int compartmentClass) {
        this.numberOfSeats = numberOfSeats;
        this.compartmentClass = compartmentClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCompartmentClass() {
        return compartmentClass;
    }

    public int getNumberOfSeatsInUse() {
        return numberOfSeatsInUse;
    }

    public void enter() {
        if (numberOfSeatsInUse < numberOfSeats) {
            numberOfSeatsInUse++;
        } else {
            SaxionApp.print("The compartment is already full!");
        }
    }

    public void leave() {
        if (numberOfSeatsInUse > 0) {
            numberOfSeatsInUse--;
        } else {
            SaxionApp.print("The compartment is already empty!");
        }
    }
}
