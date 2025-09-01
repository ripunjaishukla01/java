
class Student {
    String name;
    int age;

    public void printName() {
        System.out.println("writing something");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("constructor called ");
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ripumjai";
        s1.age = 20;

        s1.printInfo();
    }

}
