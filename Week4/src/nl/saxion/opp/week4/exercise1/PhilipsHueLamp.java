package nl.saxion.opp.week4.exercise1;

import java.awt.*;

public class PhilipsHueLamp extends DimmableLamp {
    private Color color;

    public PhilipsHueLamp() {
        super();
        this.color = Color.WHITE;
    }

    public PhilipsHueLamp(int brightness, Color color) {
        super(brightness);
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Color: "+getColor()+", "+super.toString();
    }
}
