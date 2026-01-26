import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Using a loop:");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
