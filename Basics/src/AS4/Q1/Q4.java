package AS4.Q1;
class Rectangle {
    int length;
    int width;
    public Rectangle() {
        this.length = 5;
        this.width = 5;
    }
    public Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle rOverloaded = new Rectangle(4,5);
    }
}
