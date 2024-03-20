package nl.saxion.opp.exercise1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color fillColor) {
        super(x, y, fillColor);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2 * (width + height);
    }

    public void draw() {
        SaxionApp.setFill(getFillColor());
        SaxionApp.drawRectangle(getX(), getY(), width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
