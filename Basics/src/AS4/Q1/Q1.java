package AS4.Q1;
import java.util.Scanner;
class Sqaure {
    static Scanner scnr = new Scanner(System.in);
    double side = scnr.nextDouble();
        public double getArea () {
            return side * side;
        }
        public double getPerimeter () {
            return side * 4;
        }
        public void output () {
            System.out.println("Side =" + side);
        }
    }

public class Q1 {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        Sqaure sq = new Sqaure();


    }
}

