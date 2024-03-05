package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class King {

    public int xCoordinate;
    public int yCoordinate;

    private int gridSize = 75; // For drawing

    public King(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean canMove(int xCoordinate, int yCoordinate) {
        if ((xCoordinate == this.xCoordinate + 1 || xCoordinate == this.xCoordinate - 1) && (yCoordinate == this.yCoordinate + 1 || yCoordinate == this.yCoordinate - 1)) {
            return true;
        } else if (xCoordinate == this.xCoordinate && (yCoordinate == this.yCoordinate + 1 || yCoordinate == this.yCoordinate - 1)) {
            return true;
        } else if (yCoordinate == this.yCoordinate && (xCoordinate == this.xCoordinate + 1 || xCoordinate == this.xCoordinate - 1)) {
            return true;
        }
        return false;
    }

    public void draw() {
        int calcX = 100 + xCoordinate * gridSize;
        int calcY = 100 + yCoordinate * gridSize;

        SaxionApp.drawImage("resources/king_light.png", calcX + 10, calcY + 5);
    }

    public int getGridSize() {
        return gridSize;
    }
}
