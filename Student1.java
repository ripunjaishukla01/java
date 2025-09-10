class Student {
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor called");
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ripunjai";
        s1.age = 20;

        s1.printInfo();
        s1.printName();
    }
}
