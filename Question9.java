public class Question9 {
    public static void main(String[] args) {
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                EvenSum += i;
            }
        }
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0) {
                OddSum += i;
            }
        }
        System.out.println(EvenSum);
        System.out.println(OddSum);

    }

}
