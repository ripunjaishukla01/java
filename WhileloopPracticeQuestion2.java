
import java.util.Scanner;

public class WhileloopPracticeQuestion2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int k = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int l = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
