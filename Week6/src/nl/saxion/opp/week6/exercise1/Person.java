package nl.saxion.opp.week6.exercise1;

public class Person implements Comparable<Person> {
    private String firstname;
    private String lastname;
    private String telephoneNumber;

    public Person(String firstname, String lastname, String telephoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.lastname.compareTo(o.lastname);
        if (result == 0) {
            result = this.firstname.compareTo(o.firstname);
            if (result == 0) {
                result = this.telephoneNumber.compareTo(o.telephoneNumber);
            }
        }
        return result;
    }

    public String toString() {
        return lastname + ", " + firstname + " (" + telephoneNumber + ")";
    }
}
