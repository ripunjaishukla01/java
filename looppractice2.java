
import java.util.Scanner;

public class looppractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int tab = sc.nextInt();
        int i = tab;

        // ****************************\\ Table //***************************\\
        for (i = 1; i <= 10; i++) {
            System.out.println(tab + " X " + i + " = " + tab * i);

        }
    }
}
