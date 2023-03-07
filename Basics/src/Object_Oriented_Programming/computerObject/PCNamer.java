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

        float drives[] = new float[PCList.storageNum];

        for (int num = 0; num < PCList.storageNum; num++) {
            int count = num + 1;
            System.out.println(PCList.storageNum);
            System.out.print("What is the storage capacity of drive " + count + "? (In GB): ");
            drives[num] = scnr.nextInt();
        }

        System.out.print("What is the price of computer 1?: $");
        PCList.price = scnr.nextInt();

        System.out.println(PCList.brand);
        System.out.println(PCList.CPU);
        System.out.println(PCList.GPU);
        for (int num = 0; num < PCList.storageNum; num++) {
            String byteNotation = "GB";
            if (drives[num] >= 1000) {
                drives[num] /= 1000;
                byteNotation = "TB";
                System.out.println("Drive " + num+ ": "+ drives[num] + byteNotation);
            } else {
                System.out.println("Drive" + num + ": " + drives[num] + byteNotation);
            }
        }
        System.out.println(PCList.price);

        PCObject.PC PCList2 = new PCObject.PC();
    }
}