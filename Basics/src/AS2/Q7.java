package AS2;
import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number between 0-2: ");
        int nextChoice = scnr.nextInt();
        switch(nextChoice) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Unknown");
                return;
        }
        System.out.println("\n");
    }
}
