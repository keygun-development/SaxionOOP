package nl.saxion.opp.exercise0;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Item> items = new ArrayList<>();
    private static ArrayList<Item> foodOrders = new ArrayList<>();
    private static ArrayList<Item> drinkOrders = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        new CsvReader("resources/menu_items.csv");
        CsvReader.readLine();
        while (CsvReader.hasNext()) {
            String line = CsvReader.readLine();
            String[] parts = line.split(",");
            if (parts[0].equals("d")) {
                items.add(new Drink(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]), Boolean.parseBoolean(parts[4])));
            } else {
                items.add(new Food(parts[1], Double.parseDouble(parts[2]), Integer.parseInt(parts[3]), Boolean.parseBoolean(parts[4])));
            }
        }
        printMenu();
    }

    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("******* Order system *******");
            System.out.println("* 1) Show menu and place order");
            System.out.println("* 2) Show entire order");
            System.out.println("* 0) Exit!");
            System.out.println("*****************************");
            System.out.print("Please make a selection from the menu: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println();
                    System.out.println("*************** Item selector ***************");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println("* " + (i + 1) + ") " + items.get(i));
                    }
                    System.out.println();
                    System.out.print("Please select a value: ");
                    int selection = scanner.nextInt();
                    if (items.get(selection - 1) instanceof Drink) {
                        drinkOrders.add(items.get(selection - 1));
                    } else {
                        foodOrders.add(items.get(selection - 1));
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("*** Table bill ***");
                    System.out.println();
                    System.out.println("Food items:");
                    for (Item food : foodOrders) {
                        System.out.println(food);
                    }
                    System.out.println();
                    System.out.println("Drinks:");
                    for (Item drink : drinkOrders) {
                        System.out.println(drink);
                    }
                    System.out.println();
                    System.out.println("The total amount for this order: €" + (foodOrders.stream().mapToDouble(Item::getPrice).sum() + drinkOrders.stream().mapToDouble(Item::getPrice).sum()));
                    break;
                case 0:
                    System.out.println("Thank you, please come again");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }
    }
}
