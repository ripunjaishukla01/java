public class Example134 {

    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;

        for (int i = arr.length + 1; i <= 0; i++) {
            System.out.println(arr[i]);
        }

    }
}
