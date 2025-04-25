public class String1 {
    public static void main(String args[]) {
        String name = "Ripunjai Shukla";
        System.out.println("The length of the name is : " + name.length());

        int a = 10;
        a += 10;
        System.out.println(a);

        // Method of the String
        // 1 toUppercase();
        System.out.println(name.toUpperCase());
        // 2 toLowerCase();
        System.out.println(name.toLowerCase());

        // concat
        String firstName = "Ashrut";
        String lastName = "Shukla";
        // first Approach
        String fullName = firstName.concat(lastName);
        // Second Approach
        System.out.println(firstName + " " + lastName);
        System.out.println(fullName);
        System.out.print("Hi" + "Veeru");
        System.out.println("Ripunjay's age is " + 20);
        int age = 20;
        String age1 = "20";
        System.out.println(age + age1);

        // "Veeru"
        // 01234
        String name1 = "Veeru";
        System.out.println(name1.charAt(0));
        String name2 = "Ripunjai";
        System.out.println((int) name1.compareTo(name2));
        System.out.println((boolean) name1.contains("ee"));
        System.out.println(name1.indexOf("u"));

        System.out.println(name1.replace("Vee", "Bnn"));

        String myStr = "Split a string by spaces, and also punctuation.";
        String[] myArray = myStr.split(" ");
        // for (String s : myArray) {
        // System.out.println(s);
        // }
        System.out.println(myArray[0]);

         String str = "        sdfdskfjds          ";
         System.out.println(str);
         System.out.println(str.trim());
         System.out.println(String.valueOf(true));
    }
}
