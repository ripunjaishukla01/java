
import java.util.Scanner;

public class Example116 {

    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            System.out.format("%d X %d = %d", n, i, n * i);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        multiplication(n);

    }
}