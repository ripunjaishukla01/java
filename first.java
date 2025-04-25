class first {
    int a = 10;
    int b = 20;

    // non-static method
    public void Sum() {
        System.out.println(a + b);
    }

    // Static method
    static int a1 = 20;
    static int b1 = 30;

    private static void Mul() {
        System.out.println(a1 * b1);
    }

    public static void main(String1[] args) {
        // second s1 = new second();
        // System.out.println(s1.a1);
        first f1 = new first();
        // System.out.println(f1.b);
        // System.out.println(f1.a);
        f1.Sum();
        Mul();
    }
}