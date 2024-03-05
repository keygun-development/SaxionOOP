package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        Airplane airplane = new Airplane();

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load passengers");
            SaxionApp.printLine("* 2) Load luggage");
            SaxionApp.printLine("* 3) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine("Loading passengers..");
                if (airplane.hasLockedDoors()) {
                    SaxionApp.printLine("Unable to load passengers. The doors are locked!", Color.RED);
                } else {
                    airplane.loadPassengers();
                }

                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.printLine("Loading luggage..");
                if (airplane.hasLockedDoors()) {
                    SaxionApp.printLine("Unable to load luggage. The doors are locked!", Color.RED);
                } else {
                    airplane.loadLuggage();
                }

                SaxionApp.pause();
            } else if (menuInput == 3) {
                if (airplane.hasLockedDoors()) {
                    SaxionApp.printLine("Unlocking doors");
                    airplane.unlockDoors();
                } else {
                    SaxionApp.printLine("Locking doors");
                    airplane.lockDoors();
                }
                SaxionApp.pause();
            } else if (menuInput == 9) {
                if(airplane.depart()) {
                    SaxionApp.printLine("The plane is ready to depart! Preparation complete!", Color.GREEN);
                } else {
                    SaxionApp.printLine("The plane is NOT yet ready for departure!", Color.YELLOW);
                }

                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }
}
