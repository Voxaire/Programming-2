package inClass.March_21_23; //Method Overwriting
class A{
    public void meth(){
        System.out.println("I am a Method of Class A");
    }
}
class B extends A{
    @Override
    public void meth(){
        System.out.println("I am a method of class B");
    }
    public void meth2(){
        System.out.println("I am a method 2 of Class B");
    }
}
public class Main2 {
    public static void main(String[] args) {

    }
}
