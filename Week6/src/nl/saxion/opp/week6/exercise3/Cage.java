package nl.saxion.opp.week6.exercise3;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Cage {
    private Animal animal;
    private final int capacity = 3;
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public Cage(Animal animal) {
        this.animal = animal;
        this.animals.add(animal);
    }

    public void addAnimal(Animal animal) {
        if (animal.getType() != this.animal.getType()) {
            throw new IllegalArgumentException("Animal type " + animal.getType() + " does not match cage type " + this.animal.getType());
        }
        if (animals.size() < capacity && animal.getType() == this.animal.getType()) {
            animals.add(animal);
        }
    }

    public String toString() {
        return "Cage with " + animals.size() + " animals of type " + animal.getType();
    }

    public void draw(int x, int y) {
        SaxionApp.setBorderSize(10);
        SaxionApp.drawLine(x, y, x + 300, y);
        SaxionApp.drawLine(x, y, x, y + 100);
        SaxionApp.drawLine(x + 300, y, x + 300, y + 100);
        SaxionApp.drawLine(x, y + 100, x + 300, y + 100);
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).draw(x + 10 + i * 100, y + 10);
        }
    }
}
