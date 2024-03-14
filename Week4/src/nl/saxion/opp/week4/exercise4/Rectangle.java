package nl.saxion.opp.week4.exercise4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getCircumference() {
        return 2 * (width + height);
    }

    public void draw() {
        SaxionApp.turnBorderOff();
        SaxionApp.setFill(getColor());
        SaxionApp.drawRectangle(getX(), getY(), width, height);
    }
}
