public class fibonacci {
    public static void main(String[] args) {
        int n = 15, num1 = 1, num2 = 2;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);
        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
