package AS2;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the time of day (24 Hour Format \"HH:MM\"): ");
        String userTime = scnr.nextLine();
        String formatTime = userTime.replace(":", "");
        int time = Integer.parseInt(formatTime);

        double toll = 0;
        if (time < 600) {
            toll = 1.55;
        } else if (time >= 600 && time <= 959) {
            toll = 4.65;
        } else if (time >= 1000 && time <= 1759) {
            toll = 2.35;
        } else if (time >= 1800) {
            toll = 1.55;
        } else {
            System.out.println("Enter a valid time in 24 Hour Format HH:MM");
        }
        System.out.println("The cost of the tool at "+userTime+" will be $"+toll);
    }
}
