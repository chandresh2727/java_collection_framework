package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(25);
        System.out.println(adq);
        adq.offerFirst(15);
        System.out.println("offerFirst: " +adq);
        adq.offerLast(40);
        System.out.println("Through offerLast method: " +adq);

        adq.offer(45);

        System.out.println(adq);

        System.out.println("adq.peek() "+adq.peek());
        System.out.println("adq.peekFirst()) "+adq.peekFirst());
        System.out.println("adq.peekLast()"+adq.peekLast());

        System.out.println("adq.poll() method" +adq.poll());
        System.out.println("POLLLL()" +adq);

        System.out.println("adq.pollFirst() "+adq.pollFirst());
        System.out.println("POLLFIRST() :" +adq);

        System.out.println("adq.pollLast(): "+adq.pollLast());
        System.out.println("pollLast(): " +adq);


    }
}

