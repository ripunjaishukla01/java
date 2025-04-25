public class Operators {
    public static void main(String1[] args) {
        //arithmetic operation
        int a = 10;
        int b = 2;
        int add = a+b;
        int Sub = a-b;
        System.out.println("Addtion : "+add);
        System.out.println("Subtaction : " + Sub);
        System.out.println("Multiply : "+(a*b));
        System.out.println("Division : "+(a/b));
        try {            
            System.out.println("Division : "+(a/0));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Reminder : "+(11%a));
        //++ -- 
        int num = 1;
        System.out.println(num--);
        System.out.println(num);


        //Assignment Operator
        // = += -+ *= /= 
        System.out.println("Assignment Operator");
        a = 10;
        System.out.println(a);
        System.out.println(a+=10);//a+10 = 
        System.out.println(a-=10);
        System.out.println(a*=10);
        System.out.println(a/=2);

        //Comparison Operator
        // == , => ,<=,<,>,!=
        int a1 = 10;
        int b1 = 20;
        System.out.println(a1!=b1);


        //Logical Operator
        // && ,||, !
        System.out.println(!((1<1)||(2>2)));
    }    
}
