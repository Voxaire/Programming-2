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


    public static float getCost(float cost1, float cost2) { //Will return a float.
        float avgCost=  (cost1 + cost2) / 2;
        return avgCost;
    }
    public static void main(String[] args) {
        System.out.print("What is your name?: ");
        String name = getName(); //Call the function as a variable
        System.out.println(name);
        System.out.print("Enter a temperature in Fahrenheit: ");
        float temp = getTemp();
        System.out.println(temp);
        System.out.print("Enter the cost of item: ");
        float cost1 = scnr.nextFloat();
        System.out.print("Enter the cost of another item: ");
        float cost2 = scnr.nextFloat();
        float avgCost = getCost(cost1,cost2); //Transfers variables from one method to another.
        System.out.println("The Average cost of both items is $" + avgCost);
    }
}
