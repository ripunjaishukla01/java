class MethodsINJava {
    public static void myMethod() {
        System.out.println("This is MyMethod in this Class");
    }

    public static void myMethod1() {
        System.out.println("MyMethod1");
    }

    public void printHello() {
        System.out.println("Hello Ripunjai");
    }

    public int MyNum() {
        return 5;
    }

    public static void Sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }

    public static void Sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("The sum is : " + sum);
    }

    public static double Sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        myMethod();
        // printHello();//We can not call non static methods or data members in static
        // methods for this we create object of the class
        MethodsINJava obj1 = new MethodsINJava();
        obj1.printHello();

        int myNum1 = obj1.MyNum();
        System.out.println(myNum1);

        Sum(2, 3);
        Sum(21, 31);
        Sum(12, 13);
        Sum(12, 23);
        Sum(2, 3, 4);
        Sum(21, 31, 5);
        Sum(12, 13, 6);
        Sum(12, 23, 6);

        double result = Sum(4.67, 7.78);
        System.out.println(result);
    }
}