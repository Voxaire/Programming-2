package inClass.April_6_2023;
import java.util.Scanner;
public class tryCatch {
    public static void main(String[] args) {
        int k;
        Scanner scnr = new Scanner(System.in);
        k = scnr.nextInt();
        try {
            System.out.println("1000 Divided by K is: " + 1000 / k);
        } catch (Exception e) {
            System.out.println("1000 cannot by divided by 0");
        } finally {
            System.out.println("The code as finished executing");
        }
    }
}
