package Basics;

public class Variables {
    public static void main(String[] args) {
        int x; // Basics.Variables must be defined then assigned a value. Here is an example of defining a Variable then giving it a value later
        x = 20; // The Variable x is defined as an integer data-type, then is given the value 20

        int y = 30; //This is an example of a variable being defined then assigned a value in the same line.

        //Primitive Data-Types
        byte a = 50; // Stores Numbers from -128 to 127, the Smallest Data-type.
        short b = 5000; // Stores numbers from -32,768 to 32,767
        int c = 10; // Stores numbers from -2.1B to 2.1B
        long d = 259950; // Stores numbers from -9.2 Quintillion to 9.2 Quintillion.
        float e = 10.222f; // Stores decimal numbers up to 7 decimal digits.
        double f = 10.3343432d; // More precise that floats up to 15 decimal digit.
        boolean g = true; // Stores either true or false.
        char h = 'A'; // Stores a single character as a string

        System.out.println("I have " + a + " cars");
    }
}