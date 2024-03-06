package nl.saxion.opp.week3.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionSelector {
    private ArrayList<Person> options = new ArrayList<>();
    public OptionSelector() {
    }

    public void addOption(Person option) {
        options.add(option);
    }

    public Person promptMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************** Option selector ***************");
        for (int i = 0; i< options.size(); i++) {
            System.out.println((i + 1) + ") " + options.get(i));
        }
        System.out.print("Please select a value: ");
        int input = scanner.nextInt();

        while(input < 1 || input > options.size()) {
            System.out.println("Invalid value. Please try again: ");
            input = scanner.nextInt();
        }
        return options.get(input-1);
    }
}
