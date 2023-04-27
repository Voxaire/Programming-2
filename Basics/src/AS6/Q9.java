package AS6;

import java.util.Scanner;

class divideClass{
    float divide(int num1, int num2) throws ArithmeticException { //Indicates that the method may throw an error. When it is called, it is handled by whatever called it.
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero not allowed!");
        }
        return num1 / num2;
    }
}
public class Q9 {
    public static float divideMethod(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero not allowed!"); //If a condition is met, throw an error.
        }
        float result = num1 / num2;
        System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        divideClass divideObject = new divideClass();
        System.out.println("Example of throw: Type 2 numbers one at a time to divide by eachother: ");
        float numberDivision = divideMethod(scnr.nextInt(),scnr.nextInt()); //If the 2nd number is 0, then the rest of the code will not run but will spit out the custom error message
        try { //Tries to run the method
            System.out.println("Example of throws: Type 2 numbers one at a time to divide by eachother: ");
            float numberDivison2 = divideObject.divide(scnr.nextInt(),scnr.nextInt()); //Because we are dividing by 0, will give an error.
        } catch (ArithmeticException e) { //Catches the error and handles it.
            System.out.println(e.getMessage()); //Prints the error message given from the method. Then continues with the rest of the code.
        }
        System.out.println("Done"); //Proof that the code continues
    }
}
