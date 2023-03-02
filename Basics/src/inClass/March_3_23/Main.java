package inClass.March_3_23;

class Employee {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary = s;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int peri(){
        return 4*side;
    }
}
public class Main {
    public static void main(String[] args) {
        square sq = new square();
        sq.side = 3;
        //***********************
        Employee Ware = new Employee();
        Employee Deborah = new Employee();
        Ware.setName("Clayton Ware");
        Ware.setSalary(100_000);

        System.out.println(Ware.getName());
        System.out.println(Ware.getSalary());
    }
}
