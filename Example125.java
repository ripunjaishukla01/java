
import java.util.Scanner;

// Abstraction
abstract class Account {
    private String accountNumber; // Encapsulation
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

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

// Main program with User Input
public class Example125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User chooses account type
        System.out.println("Enter account type (1 = Savings, 2 = Current): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account;

        if (choice == 1) {
            System.out.println("Enter Interest Rate (%): ");
            double rate = sc.nextDouble();
            account = new SavingsAccount(accNo, balance, rate);
        } else {
            System.out.println("Enter Overdraft Limit: ");
            double limit = sc.nextDouble();
            account = new CurrentAccount(accNo, balance, limit);
        }

        // Menu-driven operations
        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            if (account instanceof SavingsAccount) {
                System.out.println("3. Add Interest");
            }
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;
                case 3:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).addInterest();
                    } else {
                        System.out.println("Invalid option!");
                    }
                    break;
                case 0:
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
