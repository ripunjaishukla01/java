class TypeCasting {
    public static void main(String1[] args) {
        // Implicit Type Conversion - Widening
        int a = 10;
        double b = a;
        System.out.println(b);

        // Explicit TypeCasting -> Narrowing
        float a1 = 12.23f;
        int b1 = (int) a1;
        System.out.println(b1);
        byte c = (byte) b1;
        System.out.println(c);
    }
}