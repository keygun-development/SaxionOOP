package nl.saxion.opp.week3.exercise0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("*** Higher! Lower! ***");
        System.out.println("**********************");
        Scanner consoleScanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int tries = 0;

        System.out.println("Please guess a number: ");
        int guess = consoleScanner.nextInt();

        while (guess != number) {
            tries++;
            if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
            System.out.println("Please guess a number: ");
            guess = consoleScanner.nextInt();
        }
        System.out.println("Good job! The correct number was " + number + "!");
        System.out.println("You needed " + tries + " turns to guess the correct answer.");
        System.out.println("");
        System.out.println("Do you want to play again? (y/n)");
        String playAgain = consoleScanner.next();
        if (playAgain.equals("y")) {
            main(args);
        }
    }
}