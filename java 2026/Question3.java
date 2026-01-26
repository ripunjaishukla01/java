public class Question3 {
    public static void main(String[] args) {
        int[] marks = new int[10];
        marks[0] = 87;
        marks[1] = 75;
        marks[2] = 90;
        marks[3] = 68;
        marks[4] = 95;
        marks[5] = 88;
        marks[6] = 76;
        marks[7] = 84;
        marks[8] = 91;
        marks[9] = 79;
        System.out.println(marks[6]);
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double average = sum / marks.length;
        System.out.println("Average marks: " + average);

    }
}

// import java.util.Scanner;

// public class Question3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] marks = new int[10];

//         System.out.println("Enter 10 marks:");
//         for (int i = 0; i < marks.length; i++) {
//             marks[i] = sc.nextInt();
//         }

//         int sum = 0;
//         for (int i = 0; i < marks.length; i++) {
//             sum = sum + marks[i];
//         }

//         double average = (double) sum / marks.length;
//         System.out.println("Average marks: " + average);

//         sc.close();
//     }
// }



