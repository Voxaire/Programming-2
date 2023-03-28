package AS4.Q1;
class Cylinder{
    double height;
    double radius;
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getSurfaceArea() {
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double getVolume() {
        return Math.PI*radius*radius*height;
    }
}
public class Q3 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4,6);
        System.out.println("The height is " + c.getHeight());
        System.out.println("The radius is " + c.getRadius());
        System.out.println("The Surface Area is: " + c.getSurfaceArea());
        System.out.println("The Volume is: "+ c.getVolume());


    }
}
