import java.util.Scanner;

public class methodExample2 {
    void greet() {
        System.out.println("Hello  Ripunjai");
    }

    int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methodExample2 obj = new methodExample2();

        obj.greet();

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result = obj.mul(a, b);
        System.out.println("mul = " + result);

        sc.close();
    }
}