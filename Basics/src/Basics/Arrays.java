package Basics;

public class Arrays {
    public static void main(String[] args) {
        String[] ID = {"Clayton","Deborah","Cynthia","Josh","Eric"};
        System.out.println(ID[2]); // Array indexes start at 0, 0 would be "Clayton" and 2 will be "Cynthia".

        ID[4] = "Stan"; // Changes the value of one of the elements in the array.
        System.out.println(ID[4]);

        System.out.println(ID.length); // Uses the Length method to find out how many elements are in an array.

        for (int i = 0; i < ID.length; i++) {
            System.out.println(ID[i]); //Will print out the values 1 at a time depending on the value of i.
        }
        System.out.println("\n");
        for (String j : ID) { //Another way to print out the values 1 at a time. Only works for Strings
            System.out.println(j);
        }
    }
}
