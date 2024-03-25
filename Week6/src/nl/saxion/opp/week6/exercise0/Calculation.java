package nl.saxion.opp.week6.exercise0;

public abstract class Calculation {
    protected double value1;
    protected double value2;

    public Calculation(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public abstract double calculate();

    public abstract char getOperator();

    public String toString() {
        return value1 + " " + getOperator() + " " + value2 + " = " + calculate();
    }
}
