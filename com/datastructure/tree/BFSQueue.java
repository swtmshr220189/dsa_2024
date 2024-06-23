package com.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSQueue {
    //        1
    //    2        3
    //4      5  6     7

    //BFS : Level Traversing
    // 1 2 3 4 5 6 7

    //Queue
    //1 2
    // 3 4 5 6 7

    public static void traverseBFSPattern(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();
            System.out.println(currNode.value);
            if(currNode.leftNode!=null){
                queue.offer(currNode.leftNode);
            }
            if(currNode.rightNode!=null){
                queue.offer(currNode.rightNode);
            }
        }

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.leftNode = new TreeNode(2);
        //Both the ways are correct
        root.rightNode = new TreeNode(3);
        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = new TreeNode(5);
        root.rightNode.leftNode = new TreeNode(6);
        root.rightNode.rightNode = new TreeNode(7);

        traverseBFSPattern(root);
    }
}
