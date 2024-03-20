package nl.saxion.opp.exercise1;

import nl.saxion.app.SaxionApp;

public class Main implements Runnable {
    public void run() {
        Circle circle = new Circle(100, 100, 50, java.awt.Color.RED);
        Rectangle rectangle = new Rectangle(200, 200, 100, 50, java.awt.Color.BLUE);
        Square square = new Square(300, 300, 50, java.awt.Color.GREEN);

        SaxionApp.printLine("Type of shape: " + circle.getClass().getSimpleName());
        SaxionApp.printLine("Circumference: " + circle.getCircumference());
        SaxionApp.printLine("Area: " + circle.getArea());
        circle.draw();

        SaxionApp.pause();
        SaxionApp.clear();

        SaxionApp.printLine("Type of shape: " + rectangle.getClass().getSimpleName());
        SaxionApp.printLine("Circumference: " + rectangle.getCircumference());
        SaxionApp.printLine("Area: " + rectangle.getArea());
        rectangle.draw();

        SaxionApp.pause();
        SaxionApp.clear();

        SaxionApp.printLine("Type of shape: " + square.getClass().getSimpleName());
        SaxionApp.printLine("Circumference: " + square.getCircumference());
        SaxionApp.printLine("Area: " + square.getArea());
        square.draw();

        SaxionApp.pause();
    }

    public static void main(String[] args) {
        SaxionApp.start(new Main(), 1000, 1000);
    }
}
