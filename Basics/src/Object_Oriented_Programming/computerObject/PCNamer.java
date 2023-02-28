package Object_Oriented_Programming.computerObject;

import java.util.Scanner;

public class PCNamer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PCObject.PC PCList = new PCObject.PC("default", "default", "default", 500, 500);
        System.out.print("What is the brand of computer 1?: ");
        PCList.brand = scnr.nextLine();

        System.out.print("What is the CPU of computer 1?: ");
        PCList.CPU = scnr.nextLine();

        System.out.print("What is the GPU of computer 1?: ");
        PCList.GPU = scnr.nextLine();

        System.out.print("What is the price of computer 1?: ");
        PCList.price = scnr.nextInt();

        System.out.print("What is the storage of computer 1? (In GB): ");
        PCList.storage = scnr.nextInt();

        System.out.println(PCList.brand);
        System.out.println(PCList.CPU);
        System.out.println(PCList.GPU);
        System.out.println(PCList.price);
        System.out.println(PCList.storage);

        PCObject.PC PCList2 = new PCObject.PC("AMD 7650XT", "R7 5800X", "RX 6650XT", 800.0, 2021);
    }
}