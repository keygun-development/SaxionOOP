package nl.saxion.opp.week4.exercise4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Square extends Shape {
    private int side;

    public Square(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getCircumference() {
        return 4 * side;
    }

    public void draw() {
        SaxionApp.turnBorderOff();
        SaxionApp.setFill(getColor());
        SaxionApp.drawRectangle(getX(), getY(), side, side);
    }
}
