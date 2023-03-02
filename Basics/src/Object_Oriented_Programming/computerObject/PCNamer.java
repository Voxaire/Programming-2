package Object_Oriented_Programming.computerObject;

import java.util.Scanner;

public class PCNamer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PCObject.PC PCList = new PCObject.PC();
        System.out.print("What is the brand of computer 1?: ");
        PCList.brand = scnr.nextLine();

        System.out.print("What is the CPU of computer 1?: ");
        PCList.CPU = scnr.nextLine();

        System.out.print("What is the GPU of computer 1?: ");
        PCList.GPU = scnr.nextLine();

        System.out.print("How many storage drives does this computer have?: ");
        PCList.storageNum = scnr.nextInt();
        

        for (int num = 0; num <= PCList.storageNum; num++)
        System.out.print("What is the storage capacity of drive " + num + "? (In GB): ");
        String storageConverter = "GB";

        System.out.print("What is the price of computer 1?: $");
        PCList.price = scnr.nextInt();

        PCList.storage = scnr.nextInt();
        if (PCList.storage >= 1000) {
            PCList.storage /= 1000;
            storageConverter = "TB";
        }


        System.out.println(PCList.brand);
        System.out.println(PCList.CPU);
        System.out.println(PCList.GPU);
        System.out.println(PCList.storage + storageConverter);
        System.out.println(PCList.price);

        PCObject.PC PCList2 = new PCObject.PC();
    }
}