package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class learnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,10);
        list.add(4);
//        System.out.println(list);

        //Element of List
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("The element in the list is: "+list.get(i));
//        }

//        for (int i : list) {
//            System.out.println("Element is in the Array: "+i);
//        }

        Iterator<Integer> it = list.iterator();

        System.out.println("This is iteratore method through which we get the Number Line wise");

        while (it.hasNext()){
            System.out.println("Iterator: " +it.next());
        }



//        list.set(2,1000);
//        System.out.println(list);
//
//        System.out.println(list.contains(1000));



//        list.add(5);
//        System.out.println(list);
//
//
//        ArrayList<Integer> newList = new ArrayList<>();
//        newList.add(21);
//        newList.add(22);
//        list.addAll(newList);
//
//        System.out.println(list);
//
//        System.out.println(list.get(5));
//
//        list.remove(2);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(5));
//        System.out.println(list);
//
//        list.clear();
//        System.out.println(list);
//


    }
}
