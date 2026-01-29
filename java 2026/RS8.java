class Animal{
    void move(){
        System.out.println("Animal is moving");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
@Override
void move(){
    System.out.println("Dog is running");
}
  void bark(){
    System.out.println("Dog is barking");
  }
    }
public class RS8 {
 public static void main (String args []){
    Dog d = new Dog ();
    d.move();
    d.eat();
    d.bark();
 }
}
