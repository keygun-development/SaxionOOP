package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;
import java.util.function.BiPredicate;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1000, 1000);
    }

    public void run() {
        drawGrid();

        King k = new King(3, 6);
        Pawn p = new Pawn(6, 4);

        k.draw();
        showMoves(k::canMove, k.getGridSize());

        p.draw();
        showMoves(p::canMove, p.getGridSize());
    }

    private void drawGrid() {
        int gridSize = 75;

        // Draw grid
        // First horizontal lines.
        for (int i = 0; i < 8 + 1; i++) { // +1 for trailing line
            int maxLevel = 100 + (i * gridSize);

            SaxionApp.drawLine(maxLevel, 100, maxLevel, 100 + (8 * gridSize));
            SaxionApp.drawLine(100, maxLevel, 100 + (8 * gridSize), maxLevel);
        }

        // Draw labels
        for (int i = 0; i < 8; i++) {
            int fixedPos = 100 - (gridSize / 2);
            int movPos = 100 + (i * gridSize) + (int) (gridSize / 2.5);

            SaxionApp.drawText("" + i, movPos, fixedPos, 25);
            SaxionApp.drawText("" + i, fixedPos, movPos, 25);
        }
    }

    public void showMoves(BiPredicate<Integer, Integer> moveChecker, int gridSize) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (moveChecker.test(row, col)) {
                    SaxionApp.setFill(Color.GREEN);

                    SaxionApp.drawCircle(100 + row * gridSize + (gridSize / 2), 100 + col * gridSize + (gridSize / 2), 25);
                }
            }
        }
    }
}
