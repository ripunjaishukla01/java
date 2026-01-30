class Student {
    private int rollNo;
    private String name;

    public void setData(int r, String n) {
        rollNo = r;
        name = n;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class RS11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(101, "Rahul");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}
