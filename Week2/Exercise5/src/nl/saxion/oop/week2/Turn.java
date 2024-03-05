package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.ArrayList;

public class Turn {
    private ArrayList<Dice> dices = new ArrayList<Dice>();

    public Turn() {
        for (int i = 0; i < 5; i++) {
            this.dices.add(new Dice());
        }
    }

    public void roll() {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public void draw(String combination) {
        int x = 50;
        int y = 50;
        int width = 100;

        for (Dice dice : dices) {
            dice.draw(x, y, width);
            x += width + 10;
        }
        SaxionApp.printLine(combination, Color.GREEN);
    }

    public boolean isYahtzee() {
        int value = dices.get(0).getValue();
        for (Dice dice: dices) {
            if (dice.getValue() != value) {
                return false;
            }
        }
        return true;
    }

    public boolean isFourOfAKind() {
        int value = dices.get(0).getValue();
        int count = 0;
        for (Dice dice: dices) {
            if (dice.getValue() == value) {
                count++;
            }
        }
        return count >= 4;
    }

    public boolean isThreeOfAKind() {
        int value = dices.get(0).getValue();
        int count = 0;
        for (Dice dice: dices) {
            if (dice.getValue() == value) {
                count++;
            }
        }
        return count >= 3;
    }

    public boolean isFullHouse() {
        int value1 = dices.get(0).getValue();
        int value2 = dices.get(1).getValue();
        int count1 = 0;
        int count2 = 0;
        for (Dice dice: dices) {
            if (dice.getValue() == value1) {
                count1++;
            } else if (dice.getValue() == value2) {
                count2++;
            }
        }
        return (count1 == 3 && count2 == 2) || (count1 == 2 && count2 == 3);
    }

    public boolean isSmallStraight() {
        int[] values = new int[6];
        for (Dice dice: dices) {
            values[dice.getValue() - 1] = 1;
        }
        for (int i = 0; i < 3; i++) {
            if (values[i] == 1 && values[i + 1] == 1 && values[i + 2] == 1 && values[i + 3] == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isLargeStraight() {
        int[] values = new int[6];
        for (Dice dice: dices) {
            values[dice.getValue() - 1] = 1;
        }
        for (int i = 0; i < 2; i++) {
            if (values[i] == 1 && values[i + 1] == 1 && values[i + 2] == 1 && values[i + 3] == 1 && values[i + 4] == 1) {
                return true;
            }
        }
        return false;
    }
}
