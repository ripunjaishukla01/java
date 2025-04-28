
import java.util.Scanner;

public class switchCaseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number to know the day : ");
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("Monday" + "Math");
                break;
            case 2:
                System.out.println("Tuesday" + "Physics");
                break;
            case 3:
                System.out.println("Wednesday" + "English");
                break;
            case 4:
                System.out.println("Thursday" + "Hindi");
                break;
            case 5:
                System.out.println("Friday" + "Economics");
                break;
            case 6:
                System.out.println("Saturday" + "Dbms");
                break;
            case 7:
                System.out.println("Sunday" + "Chemistry");
                break;
            default:
                System.out.println("Not a day");
        }

    }
}
