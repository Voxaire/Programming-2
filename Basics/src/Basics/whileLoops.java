package Basics;
import java.util.Scanner;
public class whileLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int repeatWhile = 1;
        int repeatDoWhile = 1;
        // Condition is checked before code is ran, will not run if condition isn't true.
        while (repeatWhile  != 0) {
            System.out.print("This is a while loop, input a number (0 will exit the loop): ");
            repeatWhile  = scnr.nextInt();
        }
        // Condition is checked after code is ran, will run atleast one time.
        do {
            System.out.print("This is a do-while loop, input a number (0 will exit the loop): ");
            repeatWhile  = scnr.nextInt();
        } while (repeatDoWhile != 0);
    }
}


