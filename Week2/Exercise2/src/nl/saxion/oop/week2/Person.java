package nl.saxion.oop.week2;

public class Person {
    private String firstname;
    private String lastname;
    private String zipCode;
    private String phoneNumber;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too high.");
        }

        this.age = age;
    }

    public void setZipCode(String zipCode) {
        // TODO: Implement checks and make sure to throw an IllegalArgumentException if something goes wrong!
        this.zipCode = zipCode;
    }

    public void setPhonenumber(String phoneNumber) {
        // TODO: Implement checks and make sure to throw an IllegalArgumentException if something goes wrong!
        this.phoneNumber = phoneNumber;
    }

    /**
     * This is the default generated toString from IntelliJ. It works for now!
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}