package AS4.Q1;
import java.util.Scanner;
class Square {
    double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return side * 4;
    }
    public void output() {
        System.out.println("The side you input was: " + side);
        System.out.println("The area of the Square is: " + getArea());
        System.out.println("The perimeter of the square is: " + getPerimeter());
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input the side of a square: ");
        double side = scnr.nextDouble();
        Square square = new Square(side);
        square.output();
    }
}

