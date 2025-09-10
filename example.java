import java.util.Scanner;

public class example {
    public static void main(String args[]) {
        String name = "Ripunjai Shukla";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("The length of the name is: " + name.length());

        String firstName = "Ripunjai";
        String lastName = "Shukla";
        String fullName = firstName.concat(lastName);

        System.out.println(firstName + " " + lastName);
        System.out.println(fullName);
        System.out.print("Hi" + "Veeru");
        System.out.println(" Ripunjay's age is " + 20);

        int age = 20;
        String age1 = "20";
        System.out.println(age + age1); // Concatenation: "2020"

        System.out.println(10 < 9);

        // Scanner part must be inside main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First number: ");
        int a = sc.nextInt();
        System.out.println("Enter a Second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("Greater");
        } else {
            System.out.println("Lesser");
        }

        sc.close();
    }
}
