package nl.saxion.oop.model;

public class SQLIBounty extends Bounty {
    private String database;

    public SQLIBounty(String id, String targetName, int year, int amount, String database) {
        super(id, targetName, year, amount);
        this.database = database;
    }

    public String getDatabase() {
        return database;
    }

    public String toString() {
        return "SQLIBounty: " + super.getId() + " " + super.getTargetName() + " " + super.getYear() + " €" + super.getAmount() + " " + database;
    }
}
