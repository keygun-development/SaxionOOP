package nl.saxion.opp.week4.exercise4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        SaxionApp.turnBorderOff();
        SaxionApp.setFill(getColor());
        SaxionApp.drawCircle(getX(), getY(), radius * 2);
    }
}
