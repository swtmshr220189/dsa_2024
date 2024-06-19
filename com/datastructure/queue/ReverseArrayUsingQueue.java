package com.datastructure.queue;

import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseArrayUsingQueue {

    public static void reverseArray(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i : arr){
            queue.offer(i);
        }
        System.out.println("Before Reverse : "+queue.stream().toList());

           reverse(queue);
            System.out.println("After Reverse : "+queue);

    }

    public static void reverse(Queue<Integer> queue){

      if(queue.isEmpty()) {
          return;
      }
          int x = queue.poll();
          reverse(queue);
          queue.offer(x);
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 6, 9, 10};
        reverseArray(arr);
    }

}
