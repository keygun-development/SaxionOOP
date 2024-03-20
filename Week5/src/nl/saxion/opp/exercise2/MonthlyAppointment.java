package nl.saxion.opp.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyAppointment extends Appointment {
    public MonthlyAppointment(LocalDateTime dateTime, String title) {
        super(dateTime, title);
    }

    @Override
    public boolean occursOn(LocalDate compareDate) {
        return super.occursOn(compareDate);
    }

    public String toString() {
        return "Monthly: "+super.toString();
    }
}
