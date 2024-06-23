package com.datastructure.tree;

import java.util.Stack;

public class TraverseTreeUsingStackDFS {

    //        1
    //    2        3
    //4      5  6     7
    public static void TraverseTreeUsingStack(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            System.out.println(currNode.value);
            if(currNode.leftNode!=null){
                stack.push(currNode.leftNode);
            }
            if(currNode.rightNode!=null){
                stack.push(currNode.rightNode);
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

        TraverseTreeUsingStack(root);
    }

}
