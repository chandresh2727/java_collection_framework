package com.company;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("DOG1");
        animals.push("DOG2");
        animals.push("DOG3");
        animals.push("DOG4");
        System.out.println(animals);
        // POP the element from the stack last
        animals.pop();
        System.out.println(animals);

        System.out.println(animals.peek());// Peek means last time pushed element

    }
}
