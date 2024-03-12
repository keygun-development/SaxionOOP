package nl.saxion.opp.week4.exercise2;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Student> students = new ArrayList<Student>();
    private String teacherCode;


    public Teacher(String firstname, String lastname) {
        super(firstname, lastname);
        this.teacherCode = firstname.substring(0, 1).toUpperCase() + lastname.substring(0, 2).toUpperCase();
    }

    public void addMentorStudent(Student student) {
        students.add(student);
    }

    public int getNrOfMentorStudents() {
        return students.size();
    }

    public ArrayList<Student> getMentorStudents() {
        return students;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public String toString() {
        return super.toString() + " (" + getTeacherCode() + ") "+"has "+getNrOfMentorStudents()+" mentor students.";
    }


}
