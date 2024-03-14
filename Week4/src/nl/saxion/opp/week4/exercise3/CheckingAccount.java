package nl.saxion.opp.week4.exercise3;

public class CheckingAccount extends BankAccount {
    private int maxDebt;

    public CheckingAccount(String iban, int maxDebt) {
        super(iban);
        this.maxDebt = maxDebt;
    }

    public void withdraw(int amount) {
        if (getBalance() - amount >= -maxDebt) {
            super.withdraw(amount);
        }
    }

    public String toString() {
        return "[Checking] IBAN: "+getIban()+", balance: €"+getFormattedBalance();
    }
}
