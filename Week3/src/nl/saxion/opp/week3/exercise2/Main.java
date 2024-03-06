package nl.saxion.opp.week3.exercise2;

public class Main {
    public static void main(String[] args) {
        OptionSelector menu = new OptionSelector();
        menu.addOption(new Person("John"));
        menu.addOption(new Person("Jill"));
        menu.addOption(new Person("Joann"));
        menu.addOption(new Person("Nick"));
        menu.addOption(new Person("Bert"));
        menu.addOption(new Person("Ravi"));
        menu.addOption(new Person("Elton"));

        Person selectedPerson = menu.promptMenu();

        System.out.println("The person selected was: " + selectedPerson);
    }
}