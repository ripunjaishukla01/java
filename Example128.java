
import java.util.ArrayList;
import java.util.Scanner;

// Abstract Class (Abstraction)
abstract class Student {
    private int id; // Encapsulation
    private String name;
    private double[] marks;

    public Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double[] getMarks() {
        return marks;
    }

    // Template for calculating GPA (Polymorphism)
    public abstract double calculateGPA();

    public String calculateGrade() {
        double gpa = calculateGPA();
        if (gpa >= 9)
            return "A+";
        else if (gpa >= 8)
            return "A";
        else if (gpa >= 7)
            return "B";
        else if (gpa >= 6)
            return "C";
        else
            return "F";
    }
}

// Undergraduate Student (Inheritance)
class UndergraduateStudent extends Student {
    public UndergraduateStudent(int id, String name, double[] marks) {
        super(id, name, marks);
    }

    @Override
    public double calculateGPA() {
        double sum = 0;
        for (double mark : getMarks()) {
            sum += mark;
        }
        return sum / getMarks().length / 10; // Scale 0–10
    }
}

// Graduate Student (Inheritance)
class GraduateStudent extends Student {
    public GraduateStudent(int id, String name, double[] marks) {
        super(id, name, marks);
    }

    @Override
    public double calculateGPA() {
        double sum = 0;
        for (double mark : getMarks()) {
            sum += mark;
        }
        // Graduate GPA weighted higher
        return (sum / getMarks().length) / 9;
    }
}

// Main Program
public class Example128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- 🎓 Student Management Menu ---");
            System.out.println("1. Add Undergraduate Student");
            System.out.println("2. Add Graduate Student");
            System.out.println("3. Show All Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter number of subjects: ");
                    int n = sc.nextInt();
                    double[] marks = new double[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextDouble();
                    }

                    if (choice == 1) {
                        students.add(new UndergraduateStudent(id, name, marks));
                        System.out.println("✅ Undergraduate Student Added!");
                    } else {
                        students.add(new GraduateStudent(id, name, marks));
                        System.out.println("✅ Graduate Student Added!");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("📂 No students available!");
                    } else {
                        System.out.println("\n--- Student List ---");
                        for (Student st : students) {
                            System.out.println("ID: " + st.getId() +
                                    ", Name: " + st.getName() +
                                    ", GPA: " + String.format("%.2f", st.calculateGPA()) +
                                    ", Grade: " + st.calculateGrade());
                        }
                    }
                    break;

                case 0:
                    System.out.println("👋 Exiting Student Management System.");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice, try again.");
            }
        }
    }
}
