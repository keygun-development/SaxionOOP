package nl.saxion.opp.week4.exercise3;

public class SavingsAccount extends BankAccount {
    private double yearlyInterest;
    private CheckingAccount checkingAccount;

    public SavingsAccount(String iban, double yearlyInterest) {
        super(iban);
        this.yearlyInterest = yearlyInterest;
    }

    public void withdraw() {
        System.out.println("You can't withdraw money from a savings account");
    }

    public void addCheckAccount(CheckingAccount checkAccount) {
        this.checkingAccount = checkAccount;
    }

    public void transfer(int amount, BankAccount other) {
        super.transfer(amount, checkingAccount);
    }

    public void addYearlyInterest() {
        deposit((int) (getBalance() * yearlyInterest / 100));
    }

    public String toString() {
        return "[Saving] IBAN: "+getIban()+", balance: €"+getFormattedBalance();
    }
}
