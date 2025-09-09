
import java.util.Scanner;

public class Example118 {

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum = " + result);
        sc.close();
    }

}
