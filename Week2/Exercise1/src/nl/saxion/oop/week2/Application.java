package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;
import java.awt.*;
import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        // Add for each constructor overload one rectangle
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle(25, 25));
        rectangles.add(new Rectangle(25, 250, 30, 30));
        rectangles.add(new Rectangle(Color.green));
        rectangles.add(new Rectangle(150, 200, Color.pink));
        rectangles.add(new Rectangle(350, 400, 100, 40, Color.orange));

        // Draw all rectangles in the list
        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }
}