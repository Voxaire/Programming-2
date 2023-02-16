package AS2;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num1 = scnr.nextFloat();
        System.out.print("Enter an operator (+,-,*,/): ");
        char operator = scnr.next().charAt(0);
        System.out.print("Enter another number: ");
        float num2 = scnr.nextFloat();

        float result;
        switch(operator) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Something went wrong");
                return;
        }
        System.out.println(result);
    }
}
