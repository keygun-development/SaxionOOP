package nl.saxion.opp.week6.exercise3;

import nl.saxion.app.SaxionApp;

public class Animal {
    private String gender;
    private String type;

    public Animal(String gender, String type) {
        this.gender = gender;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Animal of type " + type + " gender " + gender;
    }

    public void draw(int x, int y) {
        System.out.println(type.toLowerCase());
        SaxionApp.drawImage("C:\\Users\\keaga\\Documents\\Saxion\\OOP\\Week6\\resources\\" + type.toLowerCase() + ".png", x, y, 100, 100);
    }
}
