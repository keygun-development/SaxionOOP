package nl.saxion.opp.week4.exercise1;

import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Lamp lamp = new Lamp();
        lamp.turnOn();

        DimmableLamp dimmableLamp = new DimmableLamp();
        dimmableLamp.setBrightness(50);
        dimmableLamp.turnOn();

        PhilipsHueLamp philipsHueLamp = new PhilipsHueLamp();
        philipsHueLamp.setColor(Color.BLUE);

        System.out.println("Regular Lamp");
        System.out.println(lamp);
        System.out.println();

        System.out.println("Dimmable Lamp");
        System.out.println(dimmableLamp);
        System.out.println();

        System.out.println("Philips HUE Lamp");
        System.out.println(philipsHueLamp);
    }
}
