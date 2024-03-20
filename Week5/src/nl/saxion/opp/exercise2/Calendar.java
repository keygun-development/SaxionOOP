package nl.saxion.opp.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public boolean removeAppointment(Appointment appointment) {
        return appointments.remove(appointment);
    }

    public void clear() {
        appointments.clear();
    }

    public ArrayList<Appointment> getAppointments(int year, int month, int day) {
        ArrayList<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.occursOn(LocalDate.of(year, month, day))) {
                result.add(appointment);
            }
        }

        return result;
    }

    public ArrayList<Appointment> getAppointments(int year, int month) {
        ArrayList<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().getYear() == year && appointment.getDate().getMonthValue() == month) {
                result.add(appointment);
            }
        }

        return result;
    }

    public ArrayList<Appointment> getAppointments(int year) {
        ArrayList<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getDate().getYear() == year) {
                result.add(appointment);
            }
        }

        return result;
    }

    public String toString() {
        return appointments.toString();
    }
}
