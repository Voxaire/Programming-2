package Basics;
import java.util.Scanner;
public class Functions {
    static Scanner scnr = new Scanner(System.in);
    public static String getName() { //Functions can be called Later in a program when needed. Uses "String" because it will return a String
        String name =  scnr.nextLine();
        return name; //Returns the string to the block of code that called it.
    }

    public static float getTemp() { //Will return a float.
        float fahTemp =  scnr.nextFloat();
        float celTemp = (fahTemp-32)*5/9;
        return celTemp;
    }

    public static void main(String[] args) {
        System.out.print("What is your name?: ");
        String name = getName();
        System.out.println(name);
        System.out.print("Enter a temperature in Fahrenheit: ");
        float temp = getTemp();
        System.out.println(temp);
    }
}
