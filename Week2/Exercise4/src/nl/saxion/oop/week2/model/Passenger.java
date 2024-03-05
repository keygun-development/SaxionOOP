package nl.saxion.oop.week2.model;

import java.util.ArrayList;

public class Passenger {
    private String firstName;
    private String lastName;
    private ArrayList<Bag> luggage;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        luggage = new ArrayList<>();
    }

    public void addLuggage(Bag b) {
        luggage.add(b);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public int getTotalLuggageWeight() {
        int totalWeight = 0;

        for(Bag b : luggage) {
            totalWeight += b.getWeight();
        }

        return totalWeight;
    }

    public ArrayList<Bag> getLuggage() {
        return luggage;
    }

    /**
     * This is a helper method to generate random passengers with 0-3 bags. Note that you must invoke this method with "Passenger.generateRandomPassengers()".
     */
    public static Passenger generateRandomPassenger() {
        String[] lastNames = {"Johnson", "Jackson", "Smith", "Turner", "Roosevelt", "Barber", "Vanderbeek", "Harrison", "Hendrickson"};
        String[] firstNames = {"John", "Jack", "Jill", "Tina", "Franklin", "Erik", "David", "Constance", "Mark", "Richard", "Rick", "Ahmed"};

        Passenger newPassenger = new Passenger(firstNames[(int) (Math.random() * firstNames.length)], lastNames[(int) (Math.random() * lastNames.length)]);

        int nrOfBags = (int) (Math.random() * 3); // 0, 1 or 2 bags are allowed.

        for (int i = 0; i < nrOfBags; i++) {
            int bagWeight = (int) (Math.random() * 20) + 5; // All bags weigh between 5 and 25 kilo's

            Bag b = new Bag(bagWeight);
            newPassenger.addLuggage(b);
        }

        return newPassenger;
    }
}

