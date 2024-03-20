package nl.saxion.opp.exercise1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Square extends Rectangle {
    public Square(int x, int y, int size, Color fillColor) {
        super(x, y, size, size, fillColor);
    }

    public double getArea() {
        return Math.pow(getWidth(), 2);
    }

    public double getCircumference() {
        return 4 * getWidth();
    }

    public void draw() {
        SaxionApp.setFill(getFillColor());
        SaxionApp.drawRectangle(getX(), getY(), getWidth(), getHeight());
    }
}
