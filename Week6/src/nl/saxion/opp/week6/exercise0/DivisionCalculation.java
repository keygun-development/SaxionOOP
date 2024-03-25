package nl.saxion.opp.week6.exercise0;

public class DivisionCalculation extends Calculation {
    public DivisionCalculation(double value1, double value2) {
        super(value1, value2);
        if(value2 == 0) throw new IllegalStateException("Cannot divide by 0.");
    }

    public double calculate() {
        return getValue1() / getValue2();
    }

    public char getOperator() {
        return '/';
    }
}
