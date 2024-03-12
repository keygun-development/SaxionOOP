package nl.saxion.opp.week4.exercise1;

public class DimmableLamp extends Lamp {
    private int brightness;

    public DimmableLamp() {
        super();
        this.brightness = 100;
    }

    public DimmableLamp(int brightness) {
        super();
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public String toString() {
        return "Brightness: "+this.brightness+"%, "+super.toString();
    }
}
