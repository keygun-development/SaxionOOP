package nl.saxion.opp.exercise4;

public class Main {
    public static void main(String[] args) {
        CandyMachine machine = new CandyMachine();

        // Add drinks
        machine.addProduct(0, new Drink("Coca Cola", 2.0, 300, 20, false));
        machine.addProduct(1, new Drink("RedBull", 2.5, 300, 100, true));

        // Add snacks
        machine.addProduct(2, new Candy("M&M's", 1.5, 230));
        machine.addProduct(3, new Candy("Mars", 1.0, 230));
        machine.addProduct(4, new Candy("Twix", 1.2, 230));
        machine.addProduct(5, new Candy("Lion", 1.25, 230));
        machine.addProduct(6, new Candy("Snickers", 1.5, 230));

        for (int i = 0; i < 3; i++) {
            machine.takeItem(0);
            machine.takeItem(1);
        }

        machine.printReport();
    }
}
