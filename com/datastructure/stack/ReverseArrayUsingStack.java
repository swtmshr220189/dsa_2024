package com.datastructure.stack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] arr) {
        Stack<Integer> forReverse = new Stack<>();

        for (int i : arr) {
            forReverse.push(i);
        }

        while (!forReverse.isEmpty()) {
            System.out.println(forReverse.pop());
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 6, 9, 10};
        reverseArray(arr);
    }

}
