import java.util.Scanner;

public class Example119 {

    static void pattern(int n) {
        for (int i = n; i >= 1; i--) { // row loop (decreasing)
            for (int j = 1; j <= i; j++) { // column loop (stars per row)
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}
