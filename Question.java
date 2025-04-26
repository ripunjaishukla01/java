
///Question - You have array of size 10 with elements {2,3,4,12,23,21,34,56,63,11} 
/// i. Find the Average of the array Elements 
/// ii.Find the Smallest Number in the array
/// iii.Find the Largest number in the array 
/// iv. Find the second Largest number in the array
/// v.Sort the array in asscending order
/// vi.Sort the array in descending order
/// vii.Find the third largest number in the array
public class Question {
    public static void main(String[] args) {
        int[] arr = new int[] { 63, 3, 4, 12, 23, 201, 11, 156, 133, 14 };
        // i
        int length = arr.length;
        double sum = 0;
        int i = 0;
        while (i < length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("The Average of the Numbers is : " + sum / length);
        // ii.
        int minElemnent = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (minElemnent > arr[i]) {
                minElemnent = arr[i];
            }
        }
        // System.out.println(minElemnent);
        // iii.,iv.,vii
        int maxElement = arr[0];
        int secondMaxElement = 0;
        int thirdmaxElement = 0;

        for (i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            } else if (secondMaxElement < arr[i] && secondMaxElement < maxElement) {
                secondMaxElement = arr[i];
            } else if ((thirdmaxElement < arr[i])
                    && (thirdmaxElement < maxElement && thirdmaxElement < secondMaxElement)) {
                thirdmaxElement = arr[i];
            }
        }
        System.out.println("First max Element is : " + maxElement);
        System.out.println("Second max element is : " + secondMaxElement);
        System.out.println("Third max element is : " + thirdmaxElement);

        // v.
        System.out.println("Sorting in Assce");
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {

                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " , ");
        }
        // vi.
        System.out.println("\n Sorting in desc");
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " , ");
        }

    }
}
