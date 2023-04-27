package AS6;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        ArrayList array1 = new ArrayList();
        array1.add("Hi");
        array1.add("my");
        array1.add("name");
        array1.add("is");
        array1.add("Alex");

        ArrayList array2 = new ArrayList();
        array2.add("Clayton");
        array2.add("Ware");
        array2.add("Clayton");
        array2.add("Ware");

        List joinedList = new ArrayList<>(array1);
        joinedList.addAll(array2);
        System.out.println(joinedList);
    }
}
