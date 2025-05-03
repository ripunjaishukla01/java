public class FactorOfNumber {
    public static void main(String[] args) {
        int num = 6, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}