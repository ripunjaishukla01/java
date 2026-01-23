
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("It's  Works!");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Number 3");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of these number is");
        System.out.println(sum);
        System.out.println("Enter Your Table No. ");
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(N + " * " + i + " = "
                               + N * i);
        }

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
     
       

    }
}
