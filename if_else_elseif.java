import java.util.Scanner;

public class if_else_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to check the eligibility to vote : ");
        int age = sc.nextInt();
        // If Condition
        // if(cond){
        // stattement;
        // }
        if (age >= 18) {
            System.out.println("Yes you are eligible to vote");
        }

        // if(){
        // statement
        // }
        // else{
        // statement
        // }
        if (age >= 18) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }

        ///if(cond)
        /// {
        /// statement
        /// } elseif(cond){
        /// statement 
        /// }
        /// else{
        /// statement
        /// }

        System.out.print("Enter your age to check whether you can drive or not : ");
        int nAge = sc.nextInt();
        if (nAge > 18 && nAge <= 60) {
            System.out.println("You can drive");
        } else if (nAge == 18) {
            System.out.println("you can drive");
        } else {
            System.out.println("You can't drive");
        }
    }

}