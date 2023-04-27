package AS6;

public class Q10 {
    public static void main(String[] args) {
        try {
            float result = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }
        try {
            Integer.parseInt("Not a number");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
    }
}
