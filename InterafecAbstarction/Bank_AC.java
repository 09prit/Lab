package Lab5;

// Abstract class representing a generic bank account
abstract class BankAccount {
    protected double balance;  // Protected field to store the account balance

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;  // Field to store the interest rate

    // Constructor to initialize balance and interest rate
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Implement the deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Implement the withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to calculate interest (currently empty)
    public void cal_Interest() {
        // TODO: Implement interest calculation
    }
}

// Subclass representing a current account
class CurrentAccount extends BankAccount {
    private double overdraftLimit;  // Field to store the overdraft limit

    // Constructor to initialize balance and overdraft limit
    public CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    // Implement the deposit method
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Implement the withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal. Transaction exceeds overdraft limit.");
        }
    }
}

// Main class to test the BankAccount, SavingsAccount, and CurrentAccount classes
public class Bank_AC {
    public static void main(String[] args) {
        // Create a savings account with initial balance and interest rate
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        // Create a current account with initial balance and overdraft limit
        CurrentAccount currentAccount = new CurrentAccount(500, 1000);

        // Deposit and withdraw operations on the savings account
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);

        // Deposit and withdraw operations on the current account
        currentAccount.deposit(100);
        currentAccount.withdraw(800);

        // Print the balances of both accounts
        System.out.println("Savings account balance: RS." + savingsAccount.getBalance());
        System.out.println("Current account balance: RS." + currentAccount.getBalance());
    }
}

output:

Savings account balance: RS.1300.0
Current account balance: RS.-200.0

