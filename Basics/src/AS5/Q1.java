package AS5;
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Write");
    }
    @Override
    void refill() {
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
public class Q1 {
    public static void main(String[] args) {
        fountainPen fpen = new fountainPen();
        fpen.changeNib();
    }
}
