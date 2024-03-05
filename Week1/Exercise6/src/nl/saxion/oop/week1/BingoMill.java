package nl.saxion.oop.week1;

import java.util.ArrayList;
import java.util.Collections;

public class BingoMill {
    private ArrayList<Integer> balls = new ArrayList<>();

    public BingoMill() {
        addShuffledBalls();
    }

    public int getNumberOfBallsRemaining() {
        return balls.size();
    }

    public int draw() {
        return getNumberOfBallsRemaining() > 0 ? balls.remove(0) : -1;
    }

    public void reset() {
        balls.clear();
        addShuffledBalls();
    }

    private void addShuffledBalls() {
        for (int i = 1; i <= 75; i++) {
            balls.add(i);
        }
        Collections.shuffle(balls);
    }
}
