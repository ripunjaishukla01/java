import java.util.*;

public class RS4 {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        System.out.println("The value of factorial n is : " + factorial(n));

    }
}
