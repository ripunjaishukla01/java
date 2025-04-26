public class Question12 {
    public static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    public static void Sub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("The sub is: " + sub);
    }

    public static void mul(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("The mul is: " + mul);
    }

    public static void div(int num1, int num2) {
        int div = num1 / num2;
        System.out.println("The div is: " + div);
    }

    public static void main(String[] args) {
        Sum(1, 2);
        Sub(10, 5);
        mul(10, 5);
        div(10, 2);
    }

}