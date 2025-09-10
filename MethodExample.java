import java.util.Scanner;

public class MethodExample {
    void greet() {
        System.out.println("Hello, Welcome to Java!");
    }

    int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MethodExample obj = new MethodExample();
        obj.greet();

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int result = obj.mul(a, b); // call multiplication method
        System.out.println("mul = " + result);

        sc.close();
    }
}
