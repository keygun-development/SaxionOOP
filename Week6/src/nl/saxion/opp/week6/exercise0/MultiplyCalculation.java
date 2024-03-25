package nl.saxion.opp.week6.exercise0;

public class MultiplyCalculation extends Calculation {
    public MultiplyCalculation(double value1, double value2) {
        super(value1, value2);
    }

    public double calculate() {
        return getValue1() * getValue2();
    }

    public char getOperator() {
        return '*';
    }
}
