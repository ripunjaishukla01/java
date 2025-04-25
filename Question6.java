
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter square root value of the number : ");
        int sqrt = sc.nextInt();
         if (Math.sqrt(num) == sqrt) {
            System.out.println("Your square root of the number is correct");
        }else{
            System.out.println("Your square root of the number is not correct");
        }
    }
    }

