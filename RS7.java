import java.util.*;

public class RS7 {

    static void swastik(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == n / 2 || j == n / 2 ||
                        (i == 0 && j > n / 2) ||
                        (j == 0 && i < n / 2) ||
                        (i == n - 1 && j < n / 2) ||
                        (j == n - 1 && i > n / 2)) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter odd number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number!");
        } else {
            swastik(n);
        }

        sc.close();
    }
}
