package nl.saxion.opp.exercise0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {
    private static Scanner fileReader;

    public CsvReader(String filename) throws FileNotFoundException {
        fileReader = new Scanner(new File(filename));
    }

    public static String readLine() {
        return fileReader.nextLine();
    }

    public static boolean hasNext() {
        return fileReader.hasNext();
    }
}