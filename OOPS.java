class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "Gel";

        pen1.printcolor();
        pen2.printcolor();
    }

}
