package com.datastructure.tree;

public class TreeNode {

    //Always Binary Tree
    int value;
    TreeNode leftNode;
    TreeNode rightNode;

    TreeNode(int d){
        this.value = d;
        this.leftNode = null;
        this.rightNode = null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(30);
        root.leftNode= new TreeNode(40);
        //Both the ways are correct
        root.rightNode.value = 50;
        root.leftNode.leftNode=new TreeNode(70);
        root.rightNode.leftNode = new TreeNode(60);
        root.rightNode.rightNode = new TreeNode(80);
    }

}
