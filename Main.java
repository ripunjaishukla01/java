import java.util.Scanner;

class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverloading m = new MethodOverloading();

        System.out.println("Enter two integers:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.println("Sum (int) = " + m.add(int1, int2));

        System.out.println("Enter two decimal numbers:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum (double) = " + m.add(d1, d2));

        sc.close();
    }
}
