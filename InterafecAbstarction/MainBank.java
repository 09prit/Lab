package Lab5;

import java.util.ArrayList;
import java.util.List;

// Interface representing a generic Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double viewBalance();
}

// Class representing a savings account
class saveingAcct implements Account {
    private double balance;
    private double interestRate;

    // Constructor to initialize balance and interest rate
    public saveingAcct(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into savings account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from savings account.");
        } else {
            System.out.println("Insufficient funds in savings account.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    @Override
    public double viewBalance() {
        return balance;
    }

    public void applyInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest of " + interest + " applied to savings account.");
    }
}

// Class representing a current account
class currentAcct implements Account {
    private double balance;
    private double overdraftLimit;

    // Constructor to initialize balance and overdraft limit
    public currentAcct(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into current account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from current account.");
        } else {
            System.out.println("Exceeds overdraft limit for current account.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current account
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

// Class representing a Bank which holds multiple accounts
class Bank {
    private List<Account> accounts;

    // Constructor to initialize the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to get the list of accounts
    public List<Account> getAccounts() {
        return accounts;
    }
}

// Main class to test the Bank, saveingAcct, and currentAcct classes
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create a savings account with initial balance and interest rate
        saveingAcct savingsAccount = new saveingAcct(1000, 5);
        // Create a current account with initial balance and overdraft limit
        currentAcct currentAccount = new currentAcct(2000, 500);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Iterate over each account and perform operations
        for (Account account : bank.getAccounts()) {
            System.out.println("Balance: " + account.viewBalance());
            account.deposit(500);
            account.withdraw(300);
            System.out.println("Balance: " + account.viewBalance());
            if (account instanceof saveingAcct) {
                saveingAcct savings = (saveingAcct) account;
                savings.applyInterest();
                System.out.println("Balance after interest: " + account.viewBalance());
            }
            System.out.println();
        }
    }
}

output:
Balance: 1000.0
Deposited 500.0 into savings account.
Withdrawn 300.0 from savings account.
Balance: 1200.0
Interest of 60.0 applied to savings account.
Balance after interest: 1260.0

Balance: 2000.0
Deposited 500.0 into current account.
Withdrawn 300.0 from current account.
Balance: 2200.0

