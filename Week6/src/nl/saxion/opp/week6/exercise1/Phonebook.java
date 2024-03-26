package nl.saxion.opp.week6.exercise1;

import java.util.TreeSet;

public class Phonebook {
    private TreeSet<Person> persons = new TreeSet<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public String toString() {
        for (Person person : persons) {
            System.out.println(person);
        }
        return "";
    }
}
