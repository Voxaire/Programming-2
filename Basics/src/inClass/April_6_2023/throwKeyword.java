package inClass.April_6_2023;

import java.util.Scanner;

public class throwKeyword {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You must be 18 years old");
        } else {
            System.out.println("Access granted, you are old enough");
        }
    }
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        checkAge(scnr.nextInt());
    }
}
