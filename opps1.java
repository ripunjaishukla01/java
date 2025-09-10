class opps {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something...");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class opps1 {
    public static void main(String[] args) {
        opps pen1 = new opps();
        pen1.color = "Blue";
        pen1.type = "Gel";

        opps pen2 = new opps();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write(); // optional usage
    }
}
