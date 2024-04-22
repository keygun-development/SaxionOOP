package nl.saxion.oop.model;

public class Bounty implements Comparable<Bounty> {
    private String id;
    private String targetName;
    private int year;
    private int amount;

    public Bounty(String id, String targetName, int year, int amount) {
        this.id = id;
        this.targetName = targetName;
        this.year = year;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getTargetName() {
        return targetName;
    }

    public int getYear() {
        return year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Bounty o) {
        return Integer.compare(this.amount, o.amount);
    }
}
