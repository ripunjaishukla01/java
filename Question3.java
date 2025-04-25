
import java.util.Scanner;

public class Question3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter  Second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int rem = num1 % num2;
        int squ = num1*num1 ;
        int squ1 = num2*num2 ;
        System.out.println("The sum of "+num1+" and "+num2 + " is:"+sum);
        System.out.println("The sub of "+num1+" and "+num2 + " is:"+sub);
        System.out.println("The mul of "+num1+" and "+num2 + " is:"+mul);
        System.out.println("The div of "+num1+" and "+num2 + " is:"+div);
        System.out.println("The rem of "+num1+" and "+num2 + " is:"+rem);
        System.out.println("The squ of "+num1+"is :"+squ);
        System.out.println("The squ1 of "+num2+"is :"+squ1);
        sc.close();


    }
}
