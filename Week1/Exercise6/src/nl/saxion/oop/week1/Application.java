package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {
		while(true) {
			BingoMill bm = new BingoMill();

			SaxionApp.printLine("Drawing 10 random numbers using the Bingo Mill!");
			for (int i = 0; i < 75; i++) {
				SaxionApp.printLine("Draw " + i + ": " + bm.draw() + " (" + bm.getNumberOfBallsRemaining() + " balls remaining)");
			}
			if(bm.getNumberOfBallsRemaining() == 0) {
				SaxionApp.printLine("The Bingo Mill is empty!");
				bm.reset();
			}
			SaxionApp.pause();
		}
	}
}
