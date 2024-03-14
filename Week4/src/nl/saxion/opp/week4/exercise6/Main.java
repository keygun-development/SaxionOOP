package nl.saxion.opp.week4.exercise6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Library library = new Library();

    public static void main(String[] args) throws FileNotFoundException {
        new CSVReader("C:\\Users\\keaga\\Documents\\Saxion\\OOP\\Week4\\resources\\books.csv");

        int books = 0;
        CSVReader.readLine();
        while (CSVReader.hasNext()) {
            String lineInFile = CSVReader.readLine();
            String[] line = lineInFile.split(";");
            Book book = new Book(line[0], line[1], line[3], line[2]);
            books++;
            library.addBook(book);
        }

        new CSVReader("C:\\Users\\keaga\\Documents\\Saxion\\OOP\\Week4\\resources\\dvds.csv");

        int dvds = 0;
        CSVReader.readLine();
        while (CSVReader.hasNext()) {
            String lineInFile = CSVReader.readLine();
            String[] line = lineInFile.split(";");
            DVD dvd = new DVD(line[0], line[1], line[6], line[7]);
            dvds++;
            library.addDVD(dvd);
        }
        System.out.println("Read " + books + " books and " + dvds + " dvds!");
        System.out.println();
        Menu();
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("X")) {
            System.out.println("[C]ollection, [L]end list, lend [O]ut, take back [I]n or e[X]it: ");
            input = scanner.nextLine();
            System.out.println("Selected option = '" + input + "'");
            System.out.println();
            switch (input) {
                case "C":
                    System.out.println("Collection:");
                    library.printCollection(false);
                    break;
                case "L":
                    System.out.println("Lend out:");
                    library.getLendOut().forEach(System.out::println);
                    break;
                case "O":
                    System.out.println("************ LibraryObject selector ************");
                    library.printCollection(true);
                    System.out.println();
                    System.out.println("Please select a value: ");
                    String value = scanner.nextLine();
                    library.lendOut(Integer.parseInt(value));
                    System.out.println("Lend out:");
                    library.getLendOut().forEach(System.out::println);
                    break;
                case "I":
                    System.out.println("************ LibraryObject selector ************");
                    library.getLendOut().forEach(System.out::println);
                    System.out.println();
                    System.out.println("Please select a value: ");
                    String value2 = scanner.nextLine();
                    library.takeBack(Integer.parseInt(value2));
                    System.out.println("Lend out:");
                    library.getLendOut().forEach(System.out::println);
                    break;
                case "X":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
