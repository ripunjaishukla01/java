
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Number");
       int num = sc.nextInt();

       if (num % 2 == 0 ) {
           System.out.println("The Number is even ");
       }
       else{
        System.out.println("the Number is odd");
       }
    }
}
