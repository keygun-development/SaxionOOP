package nl.saxion.opp.exercise4;

import java.util.ArrayList;

public class CandyMachine {
    private ArrayList<Compartment> compartments = new ArrayList<Compartment>();
    private double money;

    public CandyMachine() {
        for (int i = 0; i < 20; i++) {
            compartments.add(new Compartment());
        }
    }

    public void addProduct(int index, Product product) {
        compartments.get(index).setProduct(product);
        compartments.get(index).setAmount(5);
    }

    public void takeItem(int index) {
        if (compartments.get(index).getAmount() > 0) {
            compartments.get(index).setAmount(compartments.get(index).getAmount() - 1);
            money += compartments.get(index).getProduct().getPrice();
        }
    }

    public void emptyCompartment(int index) {
        compartments.get(index).setAmount(0);
        compartments.get(index).setProduct(null);
    }

    public double getMoney() {
        return money;
    }

    public void printReport() {
        System.out.println("Candymachine status:");
        System.out.println();
        for (Compartment compartment : compartments) {
            if (compartment.getProduct() != null) {
                System.out.println("Compartment " + compartments.indexOf(compartment) + ": " + compartment.toString());
            } else {
                System.out.println("Compartment " + compartments.indexOf(compartment) + ": Not in use");
            }
        }
        System.out.println();
        System.out.println("Total profit: €"+money);
    }

}
