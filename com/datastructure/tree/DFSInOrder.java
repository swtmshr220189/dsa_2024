package com.datastructure.tree;

public class DFSInOrder {

    //        1
    //    2        3
    //4      5  6     7

    //InOrder : 4 2 5 1 6 3 7
    //Left Root Right

    public static void inOrderTraverse(TreeNode root) {
        if (root != null) {
            inOrderTraverse(root.leftNode);
            System.out.println(root.value);
            inOrderTraverse(root.rightNode);
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

        inOrderTraverse(root);
    }

}
