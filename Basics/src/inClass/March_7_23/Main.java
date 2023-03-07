package inClass.March_7_23;

class Employee {
    private int id;
    private String name;

    public int getID() {
        return id;
    }
    public Employee(){
        id = 0;
        name = "Your Name Here";
    }
    public Employee(String myName){
        id = 1;
        name = myName;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
}

class Cylinder {

    private int radius;

    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
     //   emp1.setID(12);
     //   emp1.setName("Clayton");

        emp2.setName("Harry");
        emp2.setID(11);
        System.out.println(emp1.getID());
        System.out.println(emp1.getName());
        System.out.println(emp2.getID());
        System.out.println(emp2.getName());
    }
}