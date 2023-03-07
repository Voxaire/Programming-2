package Object_Oriented_Programming.MultipleClasses;

public class Second {
    public static void main(String[] args) {
        First myObj = new First();
        System.out.println(myObj.x);
        System.out.println(myObj.y);
        System.out.println(myObj.z);
        myObj.x = 3;
        System.out.println(myObj.x);

        System.out.println(myObj.fname+" "+myObj.lname);
    }
}
