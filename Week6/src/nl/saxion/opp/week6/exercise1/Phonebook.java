package nl.saxion.opp.week6.exercise1;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public String toString() {
        persons.sort(Person::compareTo);
        for(Person person : persons) {
            System.out.println(person);
        }
        return "";
    }
}
