package nl.saxion.opp.week4.exercise1;

public class Lamp {
    protected boolean isOn;

    public Lamp() {
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public String toString() {
        return "Status: " + (isOn() ? "ON" : "OFF");
    }
}
