package nl.saxion.opp.week6.exercise1;

public class Main {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();

        // Create people (in random order)
        phoneBook.addPerson(new Person("Tristan", "Pothoven", "0699999999"));
        phoneBook.addPerson(new Person("Piet", "Jansen", "0601234567"));
        phoneBook.addPerson(new Person("Tristan", "Pothoven", "0698765432"));
        phoneBook.addPerson(new Person("Jan", "Jansen", "0612345678"));

        // Print phonebook
        System.out.println(phoneBook);
    }
}
