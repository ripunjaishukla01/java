public class MethodExample {
    void main() {
        System.out.println("Hello, Welcome to Java!");
    }

    int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodExample obj = new MethodExample();

        obj.main();

        int mul = obj.mul(5, 10);
        System.out.println("mul ="  mul);    }
}
