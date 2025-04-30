
import java.util.Scanner;

public class SwitchQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Greeting");
        int gree = sc.nextInt();
        switch (gree) {
            case 1:
                System.out.println("HEELLO");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("JAI SHREE RAM");
        }
    }
}