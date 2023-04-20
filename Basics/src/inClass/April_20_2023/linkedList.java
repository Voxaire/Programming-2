package inClass.April_20_2023;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> list1 = new LinkedList<>();


        //Add First and Last
        list.add("Clayton");
        list.add("Deborah");
        list.addLast("Yadhira"); //Adds the element to end of the list
        list.addFirst("Kolten"); //Adds the element to the beginning of the list

        System.out.println(list);


        //Remove
        list1.add("Clayton");
        list1.add("Deborah");
        list1.add("Kolten");
        list1.add("Yadhira");
        list1.remove("Kolten"); //Additionally, can be an integer to remove an element at a certain index.

        System.out.println(list1);

        //In Arrays
        Object[] array = list1.toArray();
        for(Object o: array) {
            System.out.println(o);
        }
    }
}
