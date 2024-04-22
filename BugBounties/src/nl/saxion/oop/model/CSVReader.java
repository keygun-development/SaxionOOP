package nl.saxion.oop.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    private static Scanner scanner;
    public CSVReader(String path) throws FileNotFoundException {
        this.scanner = new Scanner(new File(path));
    }

    public static boolean hasNext() {
        return scanner.hasNext();
    }

    public static String readLine() {
        return scanner.nextLine();
    }
}
