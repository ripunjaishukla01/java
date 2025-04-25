import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        boolean isAdult = (age>=18) ? true : false ;
        if(isAdult){
            System.out.println("You are jawan");
        }else{
            System.out.println("you are larka");
        }
    }    
}
