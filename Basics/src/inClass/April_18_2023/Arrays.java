package inClass.April_18_2023;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        //Integer Array
        int element = intList.get(0);
        System.out.println(intList);
        System.out.println(element);

        intList.add(1,2);
        System.out.println(intList);

        intList.set(0,0);
        System.out.println(intList);

        intList.remove(0);
        System.out.println(intList);

        int size = intList.size();
        System.out.println(size);

        for(int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();


        //Sorting
        intList.add(0);
        Collections.sort(intList);
        System.out.println(intList);

        //String Array

        stringList.add("Red");
        stringList.add("Orange");
        stringList.add("Green");
        stringList.add("Blue");
        stringList.add("Black");
        System.out.println(stringList);
        stringList.remove("Black");
        System.out.println(stringList);

        if (stringList.contains("Red")) {
            System.out.println("Found red in the Array!");
        } else {
            System.out.println("Red was not found!");
        }

        Collections.reverse(stringList);
        System.out.println(stringList);
    }
}