package nl.saxion.opp.week4.exercise4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Main implements Runnable {
    public void run() {
        Rectangle[] rectangles = {
                new Rectangle(50, 50, 200, 100, Color.RED),
                new Rectangle(50, 250, 300, 150, Color.GREEN),
                new Rectangle(50, 450, 400, 50, Color.YELLOW)
        };
        Circle[] circles = {
                new Circle(100, 100, 50, Color.RED),
                new Circle(100, 300, 75, Color.GREEN),
                new Circle(100, 600, 100, Color.YELLOW)
        };
        Square[] squares = {
                new Square(50, 50, 50, Color.RED),
                new Square(50, 250, 250, Color.GREEN),
                new Square(50, 600, 100, Color.YELLOW)
        };

        // Print all rectangles
        for(Rectangle rectangle : rectangles) {
            rectangle.draw();

            int textX = 700;
            int textY = rectangle.getY();
            SaxionApp.turnBorderOff();
            SaxionApp.drawBorderedText("Circumference: "+ rectangle.getCircumference() + " (pixels)", textX, textY, 20);
            SaxionApp.drawBorderedText("Area: "+ rectangle.getArea() + " (pixels)", textX, textY + 20, 20);
        }

        SaxionApp.pause();
        SaxionApp.clear();

        // Print all circles
        for(Circle circle : circles) {
            circle.draw();

            int textX = 300;
            int textY = circle.getY() - (int) (0.5 * circle.getRadius());
            SaxionApp.turnBorderOff();
            SaxionApp.drawBorderedText("Circumference: "+ circle.getCircumference() + " (pixels)", textX, textY, 20);
            SaxionApp.drawBorderedText("Area: "+ circle.getArea() + " (pixels)", textX, textY + 20, 20);
        }

        SaxionApp.pause();
        SaxionApp.clear();

        // Print all squares
        for(Square s : squares) {
            s.draw();

            int textX = 500;
            int textY = s.getY();
            SaxionApp.turnBorderOff();
            SaxionApp.drawBorderedText("Circumference: "+ s.getCircumference() + " (pixels)", textX, textY, 20);
            SaxionApp.drawBorderedText("Area: "+ s.getArea() + " (pixels)", textX, textY + 20, 20);
        }
    }

    public static void main(String[] args) {
        SaxionApp.start(new Main(), 1000, 1000);
    }
}
