package nl.saxion.oop.model;

import java.util.ArrayList;
import java.util.TreeSet;

public class BugBountyAdmin {
    private ArrayList<Bounty> bounties = new ArrayList<>();
    private TreeSet<Bounty> sortedBounties = new TreeSet<>();

    public void addIDBounty(String id, String targetName, int year, int amount, String information, String gdpr) {
        for (Bounty bounty : bounties) {
            if (bounty.getTargetName().equals(targetName)) {
                bounty.setAmount(bounty.getAmount() + amount);
                return;
            }
        }
        bounties.add(new IDBounty(id, targetName, year, amount, information, gdpr));
    }

    public void addSQLIBounty(String id, String targetName, int year, int amount, String database) {
        for (Bounty bounty : bounties) {
            if (bounty.getTargetName().equals(targetName)) {
                bounty.setAmount(bounty.getAmount() + amount);
                return;
            }
        }
        bounties.add(new SQLIBounty(id, targetName, year, amount, database));
    }

    public int getTotalPayout() {
        int totalPayout = 0;
        for (Bounty bounty : bounties) {
            totalPayout += bounty.getAmount();
        }
        return totalPayout;
    }

    public void sortBounties() {
        sortedBounties.addAll(bounties);
    }

    public TreeSet<Bounty> getSortedBounties() {
        return sortedBounties;
    }

    public ArrayList<Bounty> getBounties() {
        return bounties;
    }
}
