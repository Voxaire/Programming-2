package AS2;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("How many even numbers should be summed up?: ");
        int numbersTosum = scnr.nextInt();
        int numbersSummed = 0;
        int sum = 0;
        int num;
        for (num = 0; numbersSummed <= numbersTosum; num++) {
            if (num % 2 == 0) {
                sum += num;
                numbersSummed++;
            }
        }
        System.out.println(sum);
    }
}
