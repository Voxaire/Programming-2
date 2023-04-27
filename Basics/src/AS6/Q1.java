package AS6;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("Hi");
        array.add("my");
        array.add("name");
        array.add("is");
        array.add("Clayton");

        ArrayList arrayPortion = new ArrayList(array.subList(2,5));
        System.out.println(arrayPortion);
    }
}
