package nl.saxion.opp.week4.exercise0;

public class Office extends Building {
    private String companyName;
    private int numberOfEmployees;

    public Office(String address, String zipCode, String city, int area, String companyName, int numberOfEmployees) {
        super(address, zipCode, city, area);
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String toString() {
        return "Office of " + getCompanyName() + " with " + getNumberOfEmployees() + " employees" +super.toString();
    }
}
