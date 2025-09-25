
import java.util.ArrayList;
import java.util.Scanner;

// Abstract class (Abstraction)
abstract class Item {
    private String title; // Encapsulation
    private String author;
    private int year;

    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // Polymorphism
    public abstract void displayInfo();
}

// Book class (Inheritance)
class Book extends Item {
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        super(title, author, year);
        this.isbn = isbn;
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "📖 Book - " + getTitle() + " | Author: " + getAuthor() + " | Year: " + getYear() + " | ISBN: " + isbn);
    }
}

// Magazine class (Inheritance)
class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("📰 Magazine - " + getTitle() + " | Editor: " + getAuthor() + " | Year: " + getYear()
                + " | Issue No: " + issueNumber);
    }
}

// Main program
public class Example127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> library = new ArrayList<>();

        while (true) {
            System.out.println("\n--- 📚 Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Show All Items");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String bTitle = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String bAuthor = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int bYear = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();

                    library.add(new Book(bTitle, bAuthor, bYear, isbn));
                    System.out.println("✅ Book added!");
                    break;

                case 2:
                    System.out.print("Enter Magazine Title: ");
                    String mTitle = sc.nextLine();
                    System.out.print("Enter Editor: ");
                    String mAuthor = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int mYear = sc.nextInt();
                    System.out.print("Enter Issue Number: ");
                    int issue = sc.nextInt();

                    library.add(new Magazine(mTitle, mAuthor, mYear, issue));
                    System.out.println("✅ Magazine added!");
                    break;

                case 3:
                    if (library.isEmpty()) {
                        System.out.println("📂 No items in the library!");
                    } else {
                        System.out.println("\n--- Library Items ---");
                        for (Item item : library) {
                            item.displayInfo(); // Polymorphism in action
                        }
                    }
                    break;

                case 0:
                    System.out.println("👋 Exiting Library System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice, try again.");
            }
        }
    }
}
