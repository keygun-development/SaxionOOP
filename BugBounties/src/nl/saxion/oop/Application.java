package nl.saxion.oop;

import nl.saxion.oop.model.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static final String[] MENU_OPTIONS = {
            "Add Information Disclosure bounty",       // 1
            "Add SQL injection bounty",                // 2
            "Show bug bounty overview",                // 3
            "Show bug bounties per target (sorted)",  // 4
    };

    private static ArrayList<Target> targets = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        CSVReader reader = new CSVReader("resources/targets.csv");
        reader.readLine();

        while (reader.hasNext()) {
            String line = reader.readLine();
            String[] parts = line.split(",");
            if (parts[0].equals("company")) {
                targets.add(new Company(parts[1], parts[2], parts[3]));
            } else {
                targets.add(new Charity(parts[1], parts[2], parts[4]));
            }
        }

        BugBountyAdmin admin = new BugBountyAdmin();

        //If you want you may also add some hardcoded bounties
        admin.addIDBounty("fd212311", "Bol", 2023, 400, "customer data", "true");
        admin.addIDBounty("805a9d09", "Nu", 2023, 100, "database id", "false");

        admin.addSQLIBounty("6f09f420", "Bol", 2023, 500, "django");
        admin.addSQLIBounty("eb75874b", "Amazon", 2023, 200, "postgress_amazon");

        int menuSelection;

        do {
            printMenu();

            System.out.print("Please select a menu option: ");
            menuSelection = readInt();
            System.out.println();
            switch (menuSelection) {
                case 1: {
                    System.out.println("Adding ID Bounty");
                    System.out.print("id: ");
                    String id = readString();
                    System.out.print("target: ");
                    String target = readString();
                    String finalTarget = target;
                    while (targets.stream().noneMatch(t -> t.getName().equals(finalTarget))) {
                        System.out.println("Target not found, please enter a valid target");
                        target = readString();
                    }
                    System.out.print("year: ");
                    int year = readInt();
                    while (year < 1990) {
                        System.out.println("Year is too low, please enter a higher year");
                        year = readInt();
                    }
                    System.out.print("amount: ");
                    int amount = readInt();
                    while (amount > 100000) {
                        System.out.println("Amount is too high, please enter a lower amount");
                        amount = readInt();
                    }
                    System.out.print("information: ");
                    String information = readString();
                    System.out.print("gdpr: ");
                    String gdpr = readString();
                    admin.addIDBounty(id, target, year, amount, information, gdpr);

                    break;
                }
                case 2: {
                    System.out.println("Adding SQLI Bounty");
                    System.out.print("id: ");
                    String id = readString();
                    System.out.print("target: ");
                    String target = readString();
                    String finalTarget = target;
                    while (targets.stream().noneMatch(t -> t.getName().equals(finalTarget))) {
                        System.out.println("Target not found, please enter a valid target");
                        target = readString();
                    }
                    System.out.print("year: ");
                    int year = readInt();
                    while (year < 1990) {
                        System.out.println("Year is too low, please enter a higher year");
                        year = readInt();
                    }
                    System.out.print("amount: ");
                    int amount = readInt();
                    while (amount > 100000) {
                        System.out.println("Amount is too high, please enter a lower amount");
                        amount = readInt();
                    }
                    System.out.print("database: ");
                    String database = readString();

                    admin.addSQLIBounty(id, target, year, amount, database);

                    break;
                }
                case 3: {
                    System.out.println();
                    System.out.println("Overview of bugbounties:");
                    String maxId = "";
                    int max = 0;
                    for(Bounty bounty : admin.getBounties()) {
                        if(bounty.getAmount() > max) {
                            max = bounty.getAmount();
                            maxId = bounty.getId();
                        }
                    }
                    for (Bounty bounty : admin.getBounties()) {
                        System.out.println(bounty + (bounty.getId().equals(maxId) ? " (max)" : ""));
                    }
                    System.out.println("Total payout: €" + admin.getTotalPayout());
                    break;
                }
                case 4: {
                    System.out.println();
                    System.out.println("Overview of bugbounties per target:");
                    admin.sortBounties();
                    for (Bounty bounty : admin.getSortedBounties()) {
                        System.out.println(bounty.getTargetName() + " €" + bounty.getAmount());
                    }
                    break;
                }
                case 0: {
                    //exit
                    break;
                }
                default: {
                    System.out.println("Value out of range, please try again");
                    break;
                }
            }

            System.out.println();

        } while (menuSelection != 0);

    }

    private static void printMenu() {
        int maxLength = Arrays.stream(MENU_OPTIONS).mapToInt(String::length).max().getAsInt(); // Determine menu item with the longest name.
        int repeatStars = maxLength + 7; // Add stars to cover "* X) " (5 chars) at the front AND " *" (2 chars) at the end.
        String bar = "*".repeat(repeatStars); // Create bar "***..." with desired length.

        System.out.println(bar);

        for (int i = 0; i < MENU_OPTIONS.length; i++) {
            String option = MENU_OPTIONS[i];
            System.out.printf("* %d) %-" + maxLength + "s *%n", i + 1, option);
        }

        System.out.printf("* 0) %-" + maxLength + "s *%n", "Exit");

        System.out.println(bar);
        System.out.println();
    }


    // Helper methods to do some input reading!
    private static final Scanner sc = new Scanner(System.in);

    public static String readString() {
        return sc.nextLine();
    }

    public static int readInt() {
        while (true) {
            try {
                String input = readString();
                return Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.print("Invalid value (unable to parse), please try again: ");
            }
        }
    }
}
