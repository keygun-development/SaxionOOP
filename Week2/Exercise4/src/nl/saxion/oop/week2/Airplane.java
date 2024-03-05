package nl.saxion.oop.week2;

import nl.saxion.oop.week2.model.Passenger;

import java.util.ArrayList;

public class Airplane {
    private int maxPassengers;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int maxLuggageWeight;
    private boolean lockedDoors;

    public Airplane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.maxLuggageWeight = maxPassengers * 25;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getMaxWeight() {
        return maxLuggageWeight;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Passenger p : passengers) {
            totalWeight += p.getTotalLuggageWeight();
        }
        return totalWeight;
    }

    public void boardPassenger(Passenger p) {
        if (hasLockedDoors()) {
            throw new IllegalStateException("The airplane has locked doors");
        }
        if (passengers.size() >= maxPassengers) {
            throw new IllegalStateException("The airplane is full");
        }
        if (getTotalWeight() + p.getTotalLuggageWeight() > maxLuggageWeight) {
            throw new IllegalStateException("The airplane is too heavy");
        }
        passengers.add(p);
    }

    public void lockDoors() {
        lockedDoors = true;
    }

    public void unlockDoors() {
        lockedDoors = false;
    }

    public boolean hasLockedDoors() {
        return lockedDoors;
    }

    public void depart() {
        try {
            if (hasLockedDoors()) {
                throw new IllegalStateException("The airplane has locked doors");
            }
        } catch (IllegalStateException e) {
            System.out.println("The airplane cannot depart");
        }
    }
}
