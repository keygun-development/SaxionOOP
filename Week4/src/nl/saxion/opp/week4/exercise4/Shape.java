package nl.saxion.opp.week4.exercise4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Shape {
    private int x;
    private int y;
    private Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}
