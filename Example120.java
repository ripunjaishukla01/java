// public class Example120 {
class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);

    }
}

public class Example120 {
    public static void main(String[] args) {
        System.out.println("This is our custum class");
        Employee Ripunjai = new Employee();
        Ripunjai.id = 15;
        Ripunjai.name = "Shukla";
        Ripunjai.printDetails();
        // System.out.println(Ripunjai.id);
        // System.out.println(Ripunjai.name);
    }

}
