package nl.saxion.opp.exercise2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        // Create some single appointments
        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 4, 10, 12, 15), "Visit the dentist"));
        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 3, 22, 9, 00), "Databases exam"));
        calendar.addAppointment(new SingleAppointment(LocalDateTime.of(2021, 1, 20, 15, 00), "Retake Introduction to Programming"));

        // Create some monthly appointments
        calendar.addAppointment(new MonthlyAppointment(LocalDateTime.of(2021, 2, 25, 9, 00), "Receive student finance from DUO"));
        calendar.addAppointment(new MonthlyAppointment(LocalDateTime.of(2021, 2, 1, 20, 00), "Cleaning student room"));

        // Create some yearly appointments
        calendar.addAppointment(new YearlyAppointment(LocalDateTime.of(2021, 3, 5, 9, 00), "Birthday mother"));
        calendar.addAppointment(new YearlyAppointment(LocalDateTime.of(2021, 1, 1, 0, 00), "New year"));

        // Use this space below to test your application!
        ArrayList<Appointment> result = calendar.getAppointments(2021);
        System.out.println(result.toString());
    }
}
