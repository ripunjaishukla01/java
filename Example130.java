
import java.util.*;

// ----- Abstract Transaction -----
abstract class Transaction {
    protected double amount;
    protected Date date;

    public Transaction(double amount) {
        this.amount = amount;
        this.date = new Date();
    }

    public abstract void execute(BankAccount account);
}

// ----- Withdrawal -----
class Withdrawal extends Transaction {
    public Withdrawal(double amount) {
        super(amount);
    }

    @Override
    public void execute(BankAccount account) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println(" Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance!");
        }
    }
}

// ----- Deposit -----
class Deposit extends Transaction {
    public Deposit(double amount) {
        super(amount);
    }

    @Override
    public void execute(BankAccount account) {
        account.deposit(amount);
        System.out.println(" Deposited: " + amount);
    }
}

// ----- Bank Account -----
class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

// ----- ATM -----
class ATM {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount authenticate(String accNo, String pin) {
        BankAccount acc = accounts.get(accNo);
        if (acc != null && acc.validatePin(pin)) {
            return acc;
        }
        return null;
    }
}

// ----- Main ATM System -----
public class Example130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        // Create some sample accounts
        atm.addAccount(new BankAccount("12345", "1111", 1000.0));
        atm.addAccount(new BankAccount("67890", "2222", 2000.0));

        System.out.println("=== Welcome to ATM ===");
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        BankAccount userAccount = atm.authenticate(accNo, pin);

        if (userAccount == null) {
            System.out.println(" Authentication failed. Exiting...");
            return;
        }

        System.out.println(" Login successful!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Current Balance: " + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depAmount = sc.nextDouble();
                    new Deposit(depAmount).execute(userAccount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withAmount = sc.nextDouble();
                    new Withdrawal(withAmount).execute(userAccount);
                    break;
                case 4:
                    System.out.println(" Thank you for using ATM!");
                    exit = true;
                    break;
                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
