public class methodOverloading {
   
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class main{
    public static void main(String[] args) {
        methodOverloading m = new       methodOverloading();
        System.out.println(m.add(5, 10));
        System.out.println(m.add(3.5, 4.5));
    }

    @Override
    public String toString() {
        return "main []";
    }
}


