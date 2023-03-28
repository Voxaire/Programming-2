package AS4.Q5;
class Circle {
    double radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI*radius*radius;
    }
}
class Cylinder extends Circle {
    int height;
    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }
    public double volume() {
        return super.area() * height;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5,4);
        System.out.println(circle.area());
        System.out.println(cylinder.volume());
    }
}
