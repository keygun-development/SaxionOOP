package nl.saxion.opp.exercise1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, int radius, Color fillColor) {
        super(x, y, fillColor);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        SaxionApp.setFill(getFillColor());
        SaxionApp.drawCircle(getX(), getY(), radius);
    }
}
