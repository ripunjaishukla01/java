public class MethodExample1 {
    static int multiply(int x, int y) {
        return x * y;
    }

    void displayMessage() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        int result = MethodExample1.multiply(4, 6);
        System.out.println("Multiplication = " + result);
        MethodExample1 obj = new MethodExample1();
        obj.displayMessage();
    }
}
