package nl.saxion.opp.week3.exercise4;

public class Main {
    public static void main(String[] args) {
        // uncomment the lines to test the exceptions
        Prison prison = new Prison();

        try {
            //Create cell blocks
            prison.addCellBlock("The Nerd Cave", "hack", 2);
            prison.addCellBlock("The Amsterdam zone", "drug", 3);
            prison.addCellBlock("The Principals Office", "skip", 2);
//            prison.addCellBlock("Students home", "drinking", 10);

            // Create famous prisoners
            Prisoner ruud = new Prisoner("Ruud Greven", "hacking the OOP course");
            Prisoner tristan = new Prisoner("Tristan Pothoven", "hacking back Ruud Greven");
//            Prisoner paul = new Prisoner("Paul de Groot", "hacking Tristan and Ruud out of Saxion");
//            Prisoner janWillem = new Prisoner("Jan Willem Boer", "Baking cake for students");
//            Prisoner craig = new Prisoner("Craig Bradley", "Trying to do OO properly in VBA");

            // Create lesser known prisoners
            Prisoner anna = new Prisoner("Anna Alcohol", "taking drugs to program better");
            Prisoner clay = new Prisoner("Clay Cannabis ", "smoking drugs");
            Prisoner martin = new Prisoner("Martin Meth", "hosting a drugslab");
            Prisoner carmen = new Prisoner("Carmen Class", "skipping OOP classes");
            Prisoner travis = new Prisoner("Travis Tired", "skipping assignments");
//            Prisoner john = new Prisoner("John Lennon", "Skipping Imagine classes");

            // Add prisoners to the system
            prison.addPrisoner(ruud);
            prison.addPrisoner(tristan);
//            prison.addPrisoner(paul);
//            prison.addPrisoner(janWillem);
//            prison.addPrisoner(craig);

            prison.addPrisoner(anna);
            prison.addPrisoner(clay);
            prison.addPrisoner(martin);
            prison.addPrisoner(carmen);
            prison.addPrisoner(travis);
//            prison.addPrisoner(john);
        } catch (IllegalArgumentException iae) {
            System.err.println("IllegalArgumentException: " + iae);
        } catch (IllegalStateException ise) {
            System.err.println("IllegalStateException: " + ise);
        }

        System.out.println(prison);
    }
}
