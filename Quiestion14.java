
import java.util.Scanner;

public class Quiestion14 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + (i + 1) + " is : " + arr[i]);

        }
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of  Array : ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of index " + (i + 1) + " of  Array : ");
            int num = sc.nextInt();
            arr1[i] = num;

        }
        printArray(arr1);
        System.out.println("Sorted Array : ");
        sortArray(arr1);
        printArray(arr1);

        int sumOfArray = sum(arr1);
        System.out.println("The sum of the array is : " + sumOfArray);

        // int[] arr2 = { 2, 3, 4, 4, 4, 5, 5 };
        // printArray(arr2);
    }
}