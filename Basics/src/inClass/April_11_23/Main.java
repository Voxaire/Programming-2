package inClass.April_11_23;


import java.util.Scanner;

class MyException extends Exception{
    public String toString() {
        return "I am a String";
    }

    public String getMessage() {
        return "I am a Message";
    }
}
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner scnr = new Scanner(System.in);
        a = scnr.nextInt();
        if (a<9) {
            try {
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }

}
