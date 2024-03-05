package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Dice {
    private int value;

    public int roll() {
        value = (int) (Math.random() * 6) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public void draw(int x, int y, int width) {
        SaxionApp.drawImage("C:\\Users\\keaga\\Documents\\Saxion\\OOP\\Week2\\Exercise5\\images\\" + getValue() + ".png", x, y, width, width);
    }
}
