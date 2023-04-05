package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<student> StudentSet = new HashSet<>();
        StudentSet.add(new student("A",1));
        StudentSet.add(new student("B",2));
        StudentSet.add(new student("C",3));

        // Duplicate allow

        StudentSet.add(new student("C",3));

        System.out.println(StudentSet);

        student s1 = new student("a",1);
        student s2 = new student("b",2);

        System.out.println("s1.equals(s2): "+s1.equals(s2));
        

        // This is same as a learnSet almost


//        Set<Integer> set = new LinkedHashSet<>();

        //TReeeeeeee SEttttttttttttttt

//        Set<Integer> set = new TreeSet<>();

        // TreeSet return the element in a sorted Array

//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);


//        set.add(65);  Repetition is not allowed

        // Order is not fixed there

//        System.out.println(set);
//
//        set.remove(54);
//        System.out.println(set);
//
//        System.out.println("/////set.contains(21)///// it will just return the true or false: "+set.contains(21));
//        System.out.println("/////set.contains(100)///// it will just return the true or false: "+set.contains(100));
//        System.out.println("/////set.isEmpty()///// return the true or false: "+set.isEmpty());
//        System.out.println("set.size()////////// "+set.size());


//        set.clear();// This is clear method through which set will be become empty
//
//        System.out.println(set);


    }
}
