package inClass.March_28_2023;
abstract class parent{
    public parent(){
        System.out.println("I am a constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child extends parent { //Creates a class that extends the abstract parent class.
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet1(){
        System.out.println("Good Afternoon");
    }
}
abstract class child1 extends parent { //The child class must either be abstract or use the abstract methods from the parent.
    public void health(){
        System.out.println("I am good");

    }
}
// Since the class above is now abstract, objects of it can be longer be made.
public class Abstraction {
    public static void main(String[] args) {
        //parent p = new parent(); <--This cannot be done, because the class is abstract
        child c = new child(); //A Class can be created from child, which extents parent.
    }
}
