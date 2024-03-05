package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {
		// TODO: Write your own implementation. For a better idea on what to do, we have provided a sample implementation for the run() method.
		SaxionApp.setBackgroundColor(Color.gray);

		Yahtzee yahtzee = new Yahtzee();

		while (true) {
			SaxionApp.clear();

			yahtzee.roll();
			yahtzee.draw(); // Visualize the dice results!

			SaxionApp.pause();
		}
	}
}
