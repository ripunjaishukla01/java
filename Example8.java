public class Example8 {

    public static void main(String[] args) {
        boolean x = (5 > 3) && (8 < 10);
        boolean y = (5 > 3) && (8 > 10);
        boolean z = y || x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
