package nl.saxion.opp.week3.exercise4;

import java.util.ArrayList;

public class CellBlock {
    private String name;
    private String condition;
    private int capacity;
    private ArrayList<Prisoner> prisoners = new ArrayList<>();

    public CellBlock(String name, String condition, int capacity) {
        this.name = name;
        this.condition = condition;
        this.capacity = capacity;
    }

    public void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String output = "Cellblock '" + getName() + "':\n";
        for (int i = 0; i < prisoners.size(); i++) {
            output += "  Cell " + (i + 1) + ") " + prisoners.get(i).getName() + ", Crime: " + prisoners.get(i).getCrime() + "\n";
        }
        return output;
    }
}
