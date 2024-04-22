package nl.saxion.oop.model;

public class IDBounty extends Bounty {
    private String information;
    private String gdpr;

    public IDBounty(String id, String targetName, int year, int amount, String information, String gdpr) {
        super(id, targetName, year, amount);
        this.information = information;
        this.gdpr = gdpr;
    }

    public String getInformation() {
        return information;
    }

    public String getGdpr() {
        return gdpr;
    }

    public String toString() {
        return "IDBounty: " + super.getId() + " " + super.getTargetName() + " " + super.getYear() + " €" + super.getAmount() + " " + information + " " + gdpr;
    }
}
