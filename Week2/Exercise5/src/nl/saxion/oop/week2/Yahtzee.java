package nl.saxion.oop.week2;

public class Yahtzee {
    private Turn turn;

    public Yahtzee() {
        turn = new Turn();
    }

    public void roll() {
        turn.roll();
    }

    public void draw() {
        turn.draw(determineCombination());
    }

    public String determineCombination() {
        if (turn.isYahtzee()) {
            return "Yahtzee!";
        } else if (turn.isFourOfAKind()) {
            return "Four of a kind!";
        } else if (turn.isThreeOfAKind()) {
            return "Three of a kind!";
        } else if (turn.isFullHouse()) {
            return "Full house!";
        } else if (turn.isSmallStraight()) {
            return "Small straight!";
        } else if (turn.isLargeStraight()) {
            return "Large straight!";
        } else {
            return "No combination!";
        }
    }
}
