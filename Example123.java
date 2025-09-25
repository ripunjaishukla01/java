
// Abstraction
abstract class Account {
    private String accountNumber; // Encapsulation
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Encapsulation: getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

// Inheritance
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Polymorphism - overriding withdraw()
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + " | New Balance: " + getBalance());
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

// Main class
public class Example123 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SA1001", 5000, 5);
        Account current = new CurrentAccount("CA2001", 2000, 1000);

        savings.deposit(1000);
        savings.withdraw(2000);
        ((SavingsAccount) savings).addInterest(); // Downcasting to use subclass method

        System.out.println();

        current.deposit(500);
        current.withdraw(2500); // allowed due to overdraft
        current.withdraw(1000); // exceeds overdraft
    }
}
