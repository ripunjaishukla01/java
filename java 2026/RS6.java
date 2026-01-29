import java.util.*;

public class RS6 {
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of rows for pattern: ");
        int rows = sc.nextInt();
        pattern(rows);

        sc.close();
    }
}
