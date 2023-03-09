package inClass.March_7_23;
class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a derived constructor");
    }
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child of derived constructor");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
       ChildofDerived cd = new ChildofDerived();
    }
}
