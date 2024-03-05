package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        // TODO: Implement some dummy code or feel free to use our code!
        Dealership myCarDealer = new Dealership();

        Car vw1 = new Car("Volkswagen", "12-AB-34");
        Car vw2 = new Car("Volkswagen", "AB-12-34");
        Car bmw = new Car("BMW", "AB-CD-12");

        myCarDealer.addCar(vw1);
        myCarDealer.addCar(vw2);
        myCarDealer.addCar(bmw);

        SaxionApp.printLine("There are " + myCarDealer.getNrOfCarsByBrand("Volkswagen") + " car(s) with brand Volkswagen in the system.");

        // Problem: Double license plates!
        Car mistake = new Car("BMW", "AB-CD-12");
        myCarDealer.addCar(mistake);
    }
}