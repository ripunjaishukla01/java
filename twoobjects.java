import java.util.Scanner;

public class twoobjects {
    int x; // instance variable

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");

        twoobjects myObj = new twoobjects();
        myObj.x = sc.nextInt(); // assign input to object's x

        System.out.println("The value of x is: " + myObj.x);
    }
}
