// public class RS2 {
//     public void display1() {
//         System.out.println("Method without prameters !");
//     }

//     public void display2(int a) {
//         System.out.println("Method With a single prameters; " + a);
//     }

//     public static void main(String[] args) {
//     RS2 obj = new RS2();
//     obj.display1();
//     obj.display2(5);

//     }
// }

// Single parameterized method and user input

// import java.util.Scanner;

// public class RS2 {
//     public void display1() {
//         System.out.println("Method without parameters!");
//     }

//     public void display2(int a) {
//         System.out.println("Method with a single parameter: " + a);
//     }

//     public static void main(String[] args) {
//         RS2 obj = new RS2();
//         Scanner sc = new Scanner(System.in);
//         obj.display1();
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         obj.display2(num);
//     }
// }

// Multple parameterized method with user input

import java.util.Scanner;

public class RS2 {

    public void display1() {
        System.out.println("Method without parameters!");
    }

    // Method with multiple parameters
    public void display2(int a, int b) {
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        RS2 obj = new RS2();
        Scanner sc = new Scanner(System.in);
        obj.display1();
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        obj.display2(x, y);
        sc.close();
    }
}
