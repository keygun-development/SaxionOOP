package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Pawn {

    private int xCoordinate;
    private int yCoordinate;

    private int gridSize = 75;

    public Pawn(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean canMove(int xCoordinate, int yCoordinate) {
        if (xCoordinate == this.xCoordinate && (yCoordinate == this.yCoordinate + 1 || yCoordinate == this.yCoordinate - 1) && yCoordinate < 8) {
            return true;
        }
        return false;
    }

    public void draw() {
        int calcX = 100 + xCoordinate * gridSize;
        int calcY = 100 + yCoordinate * gridSize;

        SaxionApp.drawImage("resources/pawn_light.png", calcX + 10, calcY + 5);
    }

    public int getGridSize() {
        return gridSize;
    }
}
