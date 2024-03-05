package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1000, 1000);
    }

    public void run() {
        UserAccount account = readUserAccount();

        SaxionApp.clear();

        SaxionApp.printLine("******* HI-SECURITY LOG IN TERMINAL **********");
        SaxionApp.print("Username: ");
        String username = SaxionApp.readString();
        SaxionApp.print("Password: ");
        String password = SaxionApp.readString();
        SaxionApp.printLine();

        if (account.getUsername().equals(username) && account.checkPassword(password)) {
            SaxionApp.setBackgroundColor(Color.GREEN);
            SaxionApp.printLine("******* ACCESS GRANTED **********");
        } else {
            SaxionApp.setBackgroundColor(Color.RED);
            SaxionApp.printLine("******* ACCESS DENIED **********");
        }

        SaxionApp.pause();
    }

    private UserAccount readUserAccount() {
        SaxionApp.print("Please enter a new user name: ");
        String username = SaxionApp.readString();

        SaxionApp.print("Please enter a password for user \"" + username + "\": ");
        String password = SaxionApp.readString();
        return new UserAccount(username, password);
    }
}
