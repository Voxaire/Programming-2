package inClass.March_21_23;
class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int x){
        System.out.println("I am an overloaded constructor with the value of x " + x);
    }
}

class Derived extends Base{
    Derived(){
        //super(1);
        System.out.println("I am a derived class constructor");
    }
    Derived(int x, int y){
        System.out.println("I am an overloaded class constructor of derived with value of y as " + y);
    }
}
class ChilfofDerived extends Derived{
    ChilfofDerived(){
        System.out.println("I am a child of derived");
    }
    ChilfofDerived(int x,int y,int z){
        System.out.println("I am an overloaded constructor of ChildofDerived with value of y: " + y);
    }
}
public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        ChilfofDerived cd = new ChilfofDerived(4,5,4);

    }
}
