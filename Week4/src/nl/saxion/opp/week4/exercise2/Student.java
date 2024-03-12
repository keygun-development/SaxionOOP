package nl.saxion.opp.week4.exercise2;

import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    private int studentNumber;

    public Student(String firstname, String lastname, int studentNumber) {
        super(firstname, lastname);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + studentNumber + ")";
    }

    public static ArrayList<Student> readStudentsFromFile(String filename) {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            CSVReader reader = new CSVReader(filename);
            while (reader.hasNext()) {
                Random r = new Random();
                int studentNumber = r.nextInt(999999 - 100000) + 100000;
                String line = reader.readLine();
                String[] parts = line.split(";");
                students.add(new Student(parts[1], parts[0], studentNumber));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
