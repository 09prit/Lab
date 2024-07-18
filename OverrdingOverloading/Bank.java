// BankAccount class representing a generic bank account
class BankAccount 
{
    double balance;

    // Constructor initializes balance to 0
    public BankAccount() 
    {
        balance = 0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the current balance
    public double getBalance() 
    {
        return balance;
    }
}

// SavingsAccount class representing a savings account, extends BankAccount
class SavingsAccount extends BankAccount 
{
    double withdrawalLimit;

    // Constructor initializes withdrawal limit to 500
    public SavingsAccount() 
    {
        super();
        withdrawalLimit = 500;
    }

    // Override withdraw method to enforce withdrawal limit
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= withdrawalLimit && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else 
        {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
}

// CheckingAccount class representing a checking account, extends BankAccount
class CheckingAccount extends BankAccount 
{
    double withdrawalFee;

    // Constructor initializes withdrawal fee to 2.5
    public CheckingAccount() 
    {
        super();
        withdrawalFee = 2.5;
    }

    // Override withdraw method to deduct withdrawal fee
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            balance -= withdrawalFee;
            System.out.println("Withdrawn: " + amount + " (including " + withdrawalFee + " fee)");
        } 
        else 
        {
            System.out.println("Insufficient funds");
        }
    }
}

// Main class to test the BankAccount, SavingsAccount, and CheckingAccount classes
public class Bank 
{
    public static void main(String[] args) 
    {
        // Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        // Deposit and withdraw from SavingsAccount
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(300); // Within limit
        savingsAccount.withdraw(700); // Exceeds limit
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        
        // Deposit and withdraw from CheckingAccount
        checkingAccount.deposit(800);
        checkingAccount.withdraw(200); // With fee
        checkingAccount.withdraw(700); // Insufficient funds
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}

output:

Deposited: 1000.0
Withdrawn: 300.0
Withdrawal limit exceeded or insufficient funds
Savings Account Balance: 700.0
Deposited: 800.0
Withdrawn: 200.0 (including 2.5 fee)
Insufficient funds
Checking Account Balance: 597.5

