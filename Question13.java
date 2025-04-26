
import java.util.Scanner;

public class Question13 {
    public static double sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double sub(double num1, double num2) {
        double sub = num1 - num2;
        return sub;
    }

    public static double mul(double num1, double num2) {
        double mul = num1 * num2;
        return mul;
    }

    public static double div(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }

    public static double rem(double num1, double num2) {
        double rem = num1 % num2;
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter '+' , '-' , '*' , '/' , '%' : ");
        String symbol = sc.next();
        double result;
        switch (symbol) {
            case "+":
                result = sum(num1, num2);
                System.out.println("Result : " + result);
                break;
            case "-":
                result = sub(num1, num2);
                System.out.println("Result : " + result);
                break;
            case "*":
                result = mul(num1, num2);
                System.out.println("Result : " + result);
                break;
            case "/":
                result = div(num1, num2);
                System.out.println("Result : " + result);
                break;
            case "%":
                result = rem(num1, num2);
                System.out.println("Result : " + result);
                break;

            default:
                System.out.println("Not a valid operation");
                break;
        }

        if ("+".equals(symbol)) {
            result = sum(num1, num2);
            System.out.println("Result : " + result);
        } else if ("-".equals(symbol)) {
            result = sub(num1, num2);
            System.out.println("Result : " + result);
        } else if ("*".equals(symbol)) {
            result = mul(num1, num2);
            System.out.println("Result : " + result);
        } else if ("/".equals(symbol)) {
            result = div(num1, num2);
            System.out.println("Result : " + result);
        } else if ("%".equals(symbol)) {
            result = rem(num1, num2);
            System.out.println("Result : " + result);
        } else {
            System.out.println("Not a valid Operation");
        }

        // double result = sum(12.32, 0.68);
        // double result1 = sub(10.10, 5.5);
        // double result2 = mul(10, 2);
        // double result3 = div(10.12, 0);

        // System.out.println(result);
        // System.out.println(result1);
        // System.out.println(result2);
        // System.out.println(result3);

    }

}
