package nl.saxion.opp.exercise1;

import java.awt.*;

public class Shape {
    private int x;
    private int y;
    private Color fillColor;

    public Shape(int x, int y, Color fillColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
    }

    public double getArea() {
        return 0;
    }

    public double getCircumference() {
        return 0;
    }

    public void draw() {
        System.out.println("Implement the draw method in the subclass");
    }

    public Color getFillColor() {
        return fillColor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
