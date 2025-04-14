// Base class
class BankAccount {
    protected double balance;

    // Constructor to initialize the account with a balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Subclass inheriting BankAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    // Override withdraw method to prevent withdrawal if balance falls below 100
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw. Balance cannot go below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);

        account.deposit(200);  // Deposit money
        account.withdraw(150); // Withdraw money
        account.withdraw(500); // Attempt to withdraw more than available balance
        account.checkBalance(); // Check balance
    }
}
