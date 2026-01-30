abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class RS10 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
