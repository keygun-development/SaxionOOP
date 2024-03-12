package nl.saxion.opp.week4.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Doe");
        Teacher teacher1 = new Teacher("Jane", "Doe");
        Teacher teacher2 = new Teacher("Jack", "Doe");
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);
        Student.readStudentsFromFile("resources/students.csv").forEach(student -> {
            if (student.getStudentNumber() % 3 == 0) {
                teacher.addMentorStudent(student);
            } else if (student.getStudentNumber() % 3 == 1) {
                teacher1.addMentorStudent(student);
            } else {
                teacher2.addMentorStudent(student);
            }
        });

        System.out.println();
        System.out.println("Please enter a teacher code to view their students: ");

        Scanner scanner = new Scanner(System.in);
        String teacherCode = scanner.nextLine();
        for (Teacher t : teachers) {
            if (t.getTeacherCode().equals(teacherCode)) {
                System.out.println(t);
                t.getMentorStudents().forEach(student -> System.out.println(student));
            }
        }
    }
}
