
public class RS7 {
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public String sum(String x, String y, String z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        RS7 obj = new RS7();

        System.out.println(obj.sum(59, 41));
        System.out.println(obj.sum(59, 41, 0));
        System.out.println(obj.sum("Hello ", "Ripunjai Shukla ji ", "!"));

    }

}