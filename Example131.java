public class Example131 {
    public static void main(String[] args) {
        // 1. Declare and initialize an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // 2. Access elements using index
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // 3. Modify an element
        numbers[2] = 99;
        System.out.println("Updated third element: " + numbers[2]);

        // 4. Loop through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 5. Enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 6. Array length
        System.out.println("Array length: " + numbers.length);
    }
}
