package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        TrainCompartment trainCompartment = new TrainCompartment(50, 2);

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show compartment details ");
            SaxionApp.printLine("* 2) Passenger enters");
            SaxionApp.printLine("* 3) Passenger leaves");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                // TODO: Your implementation here
                SaxionApp.printLine("There are currently " + trainCompartment.getNumberOfSeatsInUse() + " seats in use out of a total of " + trainCompartment.getNumberOfSeats() + " on the train compartment with class " + trainCompartment.getCompartmentClass());

                SaxionApp.pause();
            } else if (menuInput == 2) {

                // TODO: Your implementation here
                SaxionApp.printLine("A passenger enters the train...");
                trainCompartment.enter();

                SaxionApp.pause();
            } else if (menuInput == 3) {

                // TODO: Your implementation here

                trainCompartment.leave();

                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
                SaxionApp.quit();
            }

        } while (menuInput != 0);
    }
}