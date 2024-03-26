package nl.saxion.opp.week6.exercise3;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Main implements Runnable {
    public void run() {
        Cage cage1 = new Cage(new Elephant("male", 300));
        cage1.addAnimal(new Elephant("female", 250));
        cage1.addAnimal(new Elephant("female", 250));

        Cage cage2 = new Cage(new Ape("male", "monkey"));
        cage2.addAnimal(new Ape("female", "monkey"));

        Cage cage3 = new Cage(new Giraffe("male", 30));

        Cage cage4 = new Cage(new Lion("male", breed.AFRICAN));
        cage4.addAnimal(new Lion("female", breed.PERSIAN));

        SaxionApp.setBackgroundColor(Color.WHITE);
        cage1.draw(9, 9);
        cage2.draw(9, 122);
        cage3.draw(9, 235);
        cage4.draw(9, 348);
    }

    public static void main(String[] args) {
        SaxionApp.start(new Main(), 1000, 1000);
    }
}
