package inClass.April_6_2023;


import java.util.Scanner;

class myException extends Exception {
    @Override
    public String toString(){
        return "I am toString";
    }
    public String getMessage() {
        return "I am getMessage";
    }
}
public class extendException {
    public static void main(String[] args) {
        int a;
        Scanner scnr = new Scanner(System.in);
        if(a < 9) {
            try {
                throw new ArithmeticException("This is an Exception");
            }
        }
    }


}
