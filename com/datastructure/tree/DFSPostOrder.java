package com.datastructure.tree;

public class DFSPostOrder {
    //        1
    //    2        3
    //4      5  6     7

    //PostOrder : 4 5 2 6 7 3 1
    //Left Right Root

    public static void postOrderTraverse(TreeNode root) {
        if (root != null) {
            postOrderTraverse(root.leftNode);
            postOrderTraverse(root.rightNode);
            System.out.println(root.value);
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

        postOrderTraverse(root);
    }
}
