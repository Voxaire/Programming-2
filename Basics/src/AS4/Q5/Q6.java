package AS4.Q5;
class Rectangle{
    double length;
    double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length*width;
    }
}
class Cuboid extends Rectangle {
    double height;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public double getVolume() {
        return length*width*height;
}
}
public class Q6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,7);
        Cuboid c = new Cuboid(5,7,9);
        System.out.println(r.getArea());
        System.out.println(c.getVolume());
    }
}
