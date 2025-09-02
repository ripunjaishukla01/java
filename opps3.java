class Student {
    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name1, int age) {
        System.out.println(name + " " + age);
    }
}

public class opps3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ripunjai";
        s1.age = 20;
        s1.printInfo(s1.name, s1.age);
    }

}
