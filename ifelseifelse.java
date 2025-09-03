
import java.util.Scanner;

public class ifelseifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check whether you can drive or not : ");
        int age = sc.nextInt();
        if (age > 18 && age <= 60) {
            System.out.println("You can drive");
        } else if (age == 18) {
            System.out.println("you can drive");
        } else {
            System.out.println("You can't drive");
        }
    }
}