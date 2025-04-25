public class Loops {
    public static void main(String[] args) {
        int i = 1;
        // While
        while (i < 101) {
            System.out.println(i + " This is While Loop");
            i++;
        }

        i = 1;
        // Do While
        do {
            System.out.println(i + "->" + "This is do-While Loop");
            i++;
        } while (i < 101);

        // For Loop
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            if (j == 9)
                break;
            System.out.println(j + "->" + "This is For Loop");
        }

        // Printing the table of 5
        for (int k = 1; k <= 10; k++) {
            System.out.println(5 + " X " + k + " = " + 5 * k);
        }

        // Calculating the sum of 1 to 100 numbers

        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println("Sum of 1 to 100 is : " + sum);

        // Printing Even Numbers from 1 to 100
        for (int j = 1; j < 101; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        for (int j = 1; j < 101; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        String name = "Nikhilesh";
        for (int j = 0; j < name.length(); j++) {
            System.out.println(name.charAt(j));
        }

        int Number = 1235;
        int revNum = 0;
        while (Number != 0) {
            int remainder = Number % 10;
            revNum = revNum * 10 + remainder;
            Number = Number / 10;
        }
        System.out.println(revNum);

        // Checking For Palindrome
        int Number1 = 1235321;
        int revNum1 = 0;
        int orgNumber1 = Number1;
        while (Number1 != 0) {
            int remainder = Number1 % 10;
            revNum1 = revNum1 * 10 + remainder;
            Number1 = Number1 / 10;
        }
        if (orgNumber1 == revNum1) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }

        // Factorial of the number
        // 5! = 5*4*3*2*1 = 120

        int fact = 1;
        for (int j = 5; j >= 1; j--) {
            fact = fact * j;
        }
        System.out.println("Factorial of 5 is : " + fact);

    }
}
