package nl.saxion.opp.week4.exercise3;

public class BankAccount {
    private String iban;
    private int balance;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void transfer(int amount, BankAccount other) {
        balance -= amount;
        other.deposit(amount);
    }

    public int getBalance() {
        return balance;
    }

    public String getFormattedBalance() {
        if (String.valueOf(balance).length() < 2) {
            return balance +",00";
        }
        return String.valueOf(balance).substring(0, String.valueOf(balance).length() - 2) + "," + String.valueOf(balance).substring(String.valueOf(balance).length() - 2);
    }

    public String getIban() {
        return iban;
    }
}
