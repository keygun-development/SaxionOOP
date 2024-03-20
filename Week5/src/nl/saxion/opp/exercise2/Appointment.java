package nl.saxion.opp.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointment {
    private LocalDateTime dateTime;
    private String title;

    public Appointment(LocalDateTime dateTime, String title) {
        this.dateTime = dateTime;
        this.title = title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public LocalDate getDate() {
        return dateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return dateTime.toLocalTime();
    }

    public String getTitle() {
        return title;
    }

    public boolean occursOn(LocalDate compareDate) {
        return dateTime.toLocalDate().equals(compareDate);
    }

    public String toString() {
        return dateTime + " " + title;
    }
}
