package inClass.March_9_23;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void printMe(){
        System.out.println("Hi, I am in Base");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main2 {
    public static void main(String[] args) {
        //Creating an Object of Base
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());
        //Creating an Object of Derived
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getX());
    }
}
