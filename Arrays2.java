
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students : ");
        int nOfStudent = sc.nextInt();
        double height[] = new double[nOfStudent];
        for (int i = 0; i < nOfStudent; i++) {
            System.out.print("Enter the height of " + (i + 1) + " Student : ");
            double heightOfStudent = sc.nextDouble();
            height[i] = heightOfStudent;
        }

        for (int i = 0; i < nOfStudent; i++) {
            System.out.println("Height of " + (i + 1) + " Student is : " + height[i]);
        }
    }
}
