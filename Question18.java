
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd size (minimum 5): ");
        int n = sc.nextInt();

        if (n < 5 || n % 2 == 0) {
            System.out.println("Please enter an odd number greater than or equal to 5.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0) {
                    if (j >= n / 2 || j == 0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                else if (i < n / 2) {
                    if (j == 0 || j == n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                else if (i == n / 2) {
                    System.out.print("* ");
                }

                else if (i < n - 1) {
                    if (j == n - 1 || j == n / 2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                else {
                    if (j <= n / 2 || j == n - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
