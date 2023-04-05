package com.company;


// Set couldn't allow Duplicate Element

import java.util.HashSet;
import java.util.Set;

public class learnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
//        set.add(65);  Repetition is not allowed

        // Order is not fixed there

        System.out.println(set);

        set.remove(54);
        System.out.println(set);

        System.out.println("/////set.contains(21)///// it will just return the true or false: "+set.contains(21));
        System.out.println("/////set.contains(100)///// it will just return the true or false: "+set.contains(100));
        System.out.println("/////set.isEmpty()///// return the true or false: "+set.isEmpty());
        System.out.println("set.size()////////// "+set.size());


        set.clear();// This is clear method through which set will be become empty

        System.out.println(set);

    }
}
