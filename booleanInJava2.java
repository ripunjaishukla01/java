
import java.util.Scanner;

public class booleanInJava2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true or false:");
        boolean isPass = sc.nextBoolean();

        System.out.println("isPass = " + isPass);

        if (isPass) {
            System.out.println("Hey you win the mac Laptop");
        } else {
            System.out.println("You got thenga");
        }
    }
}
