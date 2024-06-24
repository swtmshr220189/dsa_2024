package com.datastructure.tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxValueOfLeafNodeOfTree {

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

    public static void MaxValueLeafNode(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;

        while (!queue.isEmpty()){
            TreeNode curr = queue.poll();

            if(curr.leftNode!=null){
                queue.offer(curr.leftNode);
            }
            if(curr.rightNode!=null){
                queue.offer(curr.rightNode);
            }
            else{
                max = Math.max(max, curr.value);
            }
        }

        System.out.println("Max of Leaf is : "+ max);

    }

    public static void main(String[] args) {
        System.out.println("TEST CASE 01..........................");
        TreeNode root = new TreeNode(90);
        root.leftNode = new TreeNode(20);
        //Both the ways are correct
        root.rightNode = new TreeNode(50);
        root.leftNode.leftNode = new TreeNode(10);
        root.leftNode.rightNode = new TreeNode(15);
        root.rightNode.leftNode = new TreeNode(80);
//        root.rightNode.leftNode = new TreeNode(0);
        root.rightNode.rightNode = new TreeNode(17);
        MaxValueLeafNode(root);

        System.out.println("TEST CASE 02..........................");
        TreeNode root01 = new TreeNode(18);
        root01.leftNode = new TreeNode(20);
        //Both the ways are correct
        root01.rightNode = new TreeNode(100);
        root01.leftNode.leftNode = new TreeNode(90);
//        root01.leftNode.leftNode = new TreeNode(10);
        root01.leftNode.rightNode = new TreeNode(15);
        root01.rightNode.leftNode = new TreeNode(80);
        root01.rightNode.rightNode = new TreeNode(17);
        MaxValueLeafNode(root01);
    }
}
