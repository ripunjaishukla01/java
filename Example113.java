public class Example113 {

    // *********************/ Method Overloading and Varargs Method
    // \********************//

    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    static int sum(int x, int... arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome ");
        System.out.println("The sum of 1 is:" + sum(1));
        System.out.println("The sum of 10 & 15 is:" + sum(10, 15));
        System.out.println("The sum of 10 ,15 & 15 is:" + sum(10, 15, 15));
        System.out.println("The sum of 10 ,15,15 & 10 is:" + sum(10, 15, 15, 10));
        System.out.println("The sum of 10 ,15,15,10 & 10 is:" + sum(10, 15, 15, 10, 10));

    }
}
