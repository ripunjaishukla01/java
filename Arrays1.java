
public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        char[] arr1 = { 'a', 'b', 'c', 'd', 'e' };
        String[] arr2 = { "Apple", "Orange", "Mango" };

        for (String element : arr2) {
            System.out.println(element);
        }

        System.out.println(arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
