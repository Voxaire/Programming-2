package inClass.March_9_23;

class Cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surface(){
        return 2*Math.PI*radius*radius*height + 2*Math.PI*radius*height;
    }
    public double Volume(){
        return Math.PI*radius*radius*height;
    }
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(int height) {

    }

}
public class Main {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9,12);
        Cylinder myCylinder2 = new Cylinder(9);
        System.out.println(myCylinder.surface());
        System.out.println(myCylinder.Volume());
    }
}
