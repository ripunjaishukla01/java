
//**************************/ factorial_iterative \***********************\\

import java.util.Scanner;

public class Example115 {
    static int factorial_iterative(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("the value of factorial n is:" + factorial_iterative(n));
        sc.close();
    }
}