
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Well done");
                break;
            case 'C':
            case 'c':
                System.out.println("Good");
                break;
            case 'D':
            case 'd':
                System.out.println("You passed");
                break;
            case 'F':
            case 'f':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
