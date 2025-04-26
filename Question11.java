
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line : ");
        int num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        // System.out.print("* ");
        // }

        // for (int j = 1; j <= num; j++) {
        // for (int i = 1; i <= num; i++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int j = 1; j <= num; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
