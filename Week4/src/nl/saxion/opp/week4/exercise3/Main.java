package nl.saxion.opp.week4.exercise3;

public class Main {
    public static void main(String[] args) {
        // Accounts for person 1
        CheckingAccount chequePerson1 = new CheckingAccount("NL02ABNA0123456789", 50000);
        SavingsAccount savingPerson1 = new SavingsAccount("NL03ABNA9876543210", 3.5);

        // Register that there is a relationship between the saving account and the checking account
        savingPerson1.addCheckAccount(chequePerson1);

        // Accounts for person 2
        CheckingAccount cheque1Person2 = new CheckingAccount("NL02RABO0111111111", 100000);
        CheckingAccount cheque2Person2 = new CheckingAccount("NL02RABO0222222222", 0);
        SavingsAccount savingPerson2 = new SavingsAccount("NL02RABO0333333333", 2.0);

        // Register that there is a relationship between the saving account and the checking accounts
        savingPerson2.addCheckAccount(cheque1Person2);
        savingPerson2.addCheckAccount(cheque2Person2);

        // Deposit some money to each account
        chequePerson1.deposit(10000);
        cheque1Person2.deposit(30000);
        cheque2Person2.deposit(25000);

        // Print state
        System.out.println(chequePerson1);
        System.out.println(savingPerson1);
        System.out.println(cheque1Person2);
        System.out.println(cheque2Person2);
        System.out.println(savingPerson2);

        System.out.println();

        // Withdraw some money from the accounts and transfer also some money
        chequePerson1.withdraw(5000);
        cheque1Person2.withdraw(20000);
        cheque2Person2.transfer(25000, savingPerson2);
        savingPerson2.transfer(2000, cheque1Person2);
        savingPerson2.addYearlyInterest();

        // Print state
        System.out.println(chequePerson1);
        System.out.println(savingPerson1);
        System.out.println(cheque1Person2);
        System.out.println(cheque2Person2);
        System.out.println(savingPerson2);
    }
}
