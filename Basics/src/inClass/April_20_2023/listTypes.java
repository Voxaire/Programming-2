package inClass.April_20_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class listTypes {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add(new Integer("327"));
        arrayList.add(new Integer("403"));

        Comparable obj = Collections.max(arrayList);

        System.out.println("Max: " + obj);
    }

}
