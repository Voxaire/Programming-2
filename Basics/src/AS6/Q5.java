package AS6;
import java.util.LinkedList;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.addFirst(3);
        numbers.addFirst(7);
        numbers.addFirst(8);
        numbers.addLast(77);
        numbers.removeFirst();

        System.out.println("The Size of the Linked list: " + numbers.size());
    }
}


