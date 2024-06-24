package com.datastructure.tree;

import java.util.Arrays;
import java.util.Stack;

public class MaxConsecutiveOnesOfBinaryArray {
    // Binary array int[] = {0, 1, 1, 0, 1, 1, 1, 0}, ans = 3

    //Solution 1 : I tried using Stack, but later we realized, even though the Time Complexity would be
    //Big O(n), but the Space would also be the same i.e. O(n). we can optimized the space.

    //Note : whenever we use the Collections like LinkedList, ArrayList, HashSet, Stack, Queue etc to hold the Inputs or any other thing.
    //The Space Complexity would depend on the input provided. So it would be O(n).

    //Solution 2 : To optimized the Space Complexity we will try with for loop

    public static void approch2(int[] array) {
//        int[] = {0, 1, 1, 0, 1, 1, 1, 0}
        //This will pass for scenario {1,1,1,1} too
        int count = 0;
        int max = 0;
        for (int num : array) {
            if (num == 1) {
                count++;
            } else {
                count = 0;//0 1 2 0 1 2 3
            }
            max = Math.max(max, count);//1 2 2 2 2 3
        }
        System.out.println("approch 2 max is :" + max);
    }

    public static void approch1(int[] array) {
//        int[] = {0, 1, 1, 0, 1, 1, 1, 0}

        //This will fail for scenario {1,1,1,1}
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int max = 0;
        for (int num : array) {
            if (num == 1) {
                stack.push(num);
            } else {
                while (!stack.isEmpty()) {
                    sum = sum + stack.pop();
                }
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        System.out.println("max is : " + max);
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 1, 1, 0};
        approch1(array);
        approch2(array);

        int[] array1 = {1, 1, 1, 1, 0};
        approch1(array1);
        approch2(array1);

        int[] array2 = {1, 1, 1, 1};
        approch1(array2); //fail
        approch2(array2); //pass
    }
}
