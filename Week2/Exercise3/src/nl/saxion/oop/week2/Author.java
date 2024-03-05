package nl.saxion.oop.week2;

import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate birthdate;

    public Author(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
}
