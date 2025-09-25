
import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class (Abstraction)
abstract class Employee {
    private int id; // Encapsulation
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary(); // Polymorphism
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0); // baseSalary not used
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main Program
public class Example126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int fId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String fName = sc.nextLine();
                    System.out.print("Enter Base Salary: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();

                    employees.add(new FullTimeEmployee(fId, fName, base, bonus));
                    System.out.println("Full-Time Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int pId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String pName = sc.nextLine();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();

                    employees.add(new PartTimeEmployee(pId, pName, rate, hours));
                    System.out.println("Part-Time Employee Added!");
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println("No employees added yet!");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee emp : employees) {
                            System.out.println("ID: " + emp.getId() +
                                    ", Name: " + emp.getName() +
                                    ", Salary: " + emp.calculateSalary());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting Employee Management. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
