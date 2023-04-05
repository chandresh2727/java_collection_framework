package com.company;

import java.util.*;

import static java.util.Collection.*;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        // This is method for finding smalest element from the collection class

//        System.out.println("min element: "+ min(list));
//        System.out.println("max element: "+ max(list));
//        System.out.println(Collections.frequency(list,9));


        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);


    }
}

