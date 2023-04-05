package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(15);
        queue.offer(30);
        queue.offer(45);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());


    }
}
