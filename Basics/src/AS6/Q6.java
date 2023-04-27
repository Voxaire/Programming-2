package AS6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number to find the Factorial of: ");
        long number = scnr.nextInt(); //Can at most be 20 when using the long data type.
        long factorial = getFactorial(number); // Call the method to calculate factorial
        System.out.println(number + "!" + " = " + factorial);
    }

    public static long getFactorial(long number) {
        if (number == 0) {
            return 1; // 0! = 1
        } else {
            return number * getFactorial(number - 1); // Recursive to calculate (n-1)!
        }
    }
}
