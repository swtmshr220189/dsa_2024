package com.datastructure.tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaxValueOfTree {

    //            18
    //      20           50
    //   10   15      80    17

    //            18
    //      20           50
    //   90   15      80    17

    //               18
    //        20            50
    //    10     15      80     17
    //  90 67  21  10  15  12 89  72

    //Solution : Idea is to put all the elements inside the Queue/Stack[Anyone would be fine]
    // and keep on updating the Max variable
    // by comparing the Max and the Current travesed Node value.

    public static void maxValueUsingQueue(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;

        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            max = Math.max(max, currNode.value);
//            System.out.println(currNode.value);

            if(currNode.leftNode!=null){
                queue.offer(currNode.leftNode);
            }
            if(currNode.rightNode!=null){
                queue.offer(currNode.rightNode);
            }
        }
        System.out.println("Max value is : "+max);

    }

    public static void maxValueUsingStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int max = 0;

        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            max = Math.max(max, currNode.value);
//            System.out.println(currNode.value);

            if(currNode.leftNode!=null){
                stack.push(currNode.leftNode);
            }
            if(currNode.rightNode!=null){
                stack.push(currNode.rightNode);
            }
        }
        System.out.println("Max value is : "+max);
    }

    public static void main(String[] args) {
        System.out.println("TEST CASE 01..........................");
        TreeNode root = new TreeNode(18);
        root.leftNode = new TreeNode(20);
        //Both the ways are correct
        root.rightNode = new TreeNode(50);
        root.leftNode.leftNode = new TreeNode(10);
        root.leftNode.rightNode = new TreeNode(15);
        root.rightNode.leftNode = new TreeNode(80);
        root.rightNode.rightNode = new TreeNode(17);

        maxValueUsingQueue(root);
        maxValueUsingStack(root);

        System.out.println("TEST CASE 02..........................");
        TreeNode root01 = new TreeNode(18);
        root01.leftNode = new TreeNode(20);
        //Both the ways are correct
        root01.rightNode = new TreeNode(50);
        root01.leftNode.leftNode = new TreeNode(90);
        root01.leftNode.rightNode = new TreeNode(15);
        root01.rightNode.leftNode = new TreeNode(80);
        root01.rightNode.rightNode = new TreeNode(17);

        maxValueUsingQueue(root01);
        maxValueUsingStack(root01);

    }

}
