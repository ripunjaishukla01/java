public class Question_12 {
    public static int factorial(int num) {
        int fact = num;
        if (num > 0) {
            return fact * factorial(num - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        int fact = factorial(0);
        System.out.println(fact);
    }
}
