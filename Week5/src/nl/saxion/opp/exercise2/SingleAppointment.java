package nl.saxion.opp.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleAppointment extends Appointment {
    public SingleAppointment(LocalDateTime dateTime, String title) {
        super(dateTime, title);
    }

    @Override
    public boolean occursOn(LocalDate compareDate) {
        return super.occursOn(compareDate);
    }

    public String toString() {
        return "Single: "+super.toString();
    }
}
