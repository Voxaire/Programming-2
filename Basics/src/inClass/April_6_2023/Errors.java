package inClass.April_6_2023;

import java.util.Scanner;
public class Errors {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
       // Handling Errors
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 55;
        marks[2] = 3;
        System.out.print("Enter the index: ");
        int idx = scnr.nextInt();
        System.out.print("The number you want to divide: ");
        int number = scnr.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[idx]);
            System.out.println("The value at array-value/number is: " + marks[idx]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Error");
            System.out.println(e);

        }
        catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println(e);

        }
        catch (Exception e) {
        System.out.println("Some Problem occured");
    }
    }
}
