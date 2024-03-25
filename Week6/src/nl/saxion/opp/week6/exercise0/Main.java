package nl.saxion.opp.week6.exercise0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Calculation> calculations = new ArrayList<>();

        calculations.add(new SumCalculation(5, 10));
        calculations.add(new SubtractCalculation(20, 10));
        calculations.add(new MultiplyCalculation(20, 6));
        calculations.add(new DivisionCalculation(35, 7));

        try {
            calculations.add(new DivisionCalculation(35, 0));
        } catch (IllegalStateException ise) {
            System.err.println("Error: " + ise.getMessage());
        }

        // Execute calculations
        for (Calculation calculation : calculations) {
            System.out.println(calculation);
        }
    }
}
