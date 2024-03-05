package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // Usage example, assume the car does 10 km to a litre gas:
        Car myCar = new Car("Toyota", "12-AB-CD", 50, 10);

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Display statistics of the car ");
            SaxionApp.printLine("* 2) Drive some kilometers");
            SaxionApp.printLine("* 3) Refuel");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.print(myCar);
                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.print("How many kilometers are you going to drive? ");
                int milesToDrive = SaxionApp.readInt();
                myCar.drive(milesToDrive);
                SaxionApp.pause();
            } else if (menuInput == 3) {
                SaxionApp.print("How many litres do you want to throw into the tank? ");
                int litres = SaxionApp.readInt();
                myCar.fuel(litres);
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }
        } while (menuInput != 0);

    }
}
