
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber : ");
        int num = sc.nextInt();

        int i = num;
        for (i = 1; i <= num; i++) {
            System.out.println(i + ". " + "hello");

        }
    }

}