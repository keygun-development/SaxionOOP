package nl.saxion.opp.week3.exercise4;

import java.util.ArrayList;

public class Prison {
    private ArrayList<CellBlock> cellBlocks = new ArrayList<>();

    public void addCellBlock(String name, String condition, int capacity) {
        if (capacity > 4) {
            throw new IllegalArgumentException("A cell block can only have 4 cells");
        }
        cellBlocks.add(new CellBlock(name, condition, capacity));
    }

    public void addPrisoner(Prisoner prisoner) {
        boolean foundCellBlock = false;
        for (CellBlock cellBlock : cellBlocks) {
            if (prisoner.getCrime().contains(cellBlock.getCondition())) {
                foundCellBlock = true;
                if (cellBlock.getPrisoners().size() >= cellBlock.getCapacity()) {
                    throw new IllegalStateException("Cell block " + cellBlock.getName() + " is full");
                }
                cellBlock.addPrisoner(prisoner);
            }
        }
        if (!foundCellBlock) {
            throw new IllegalStateException("No cell block for crime " + prisoner.getCrime() + " can be found");
        }
    }

    public String toString() {
        String output = "";
        for (CellBlock cellBlock : cellBlocks) {
            output += cellBlock.toString() + "\n";
        }
        return output;
    }
}
