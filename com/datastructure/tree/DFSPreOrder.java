package com.datastructure.tree;

public class DFSPreOrder {
    //        1
    //    2        3
    //4      5  6     7

    //PostOrder : 1 2 4 5 3 6 7
    //Root Left Right

    public static void preOrderTraverse(TreeNode root) {
        if (root != null) {
            System.out.println(root.value);
            preOrderTraverse(root.leftNode);
            preOrderTraverse(root.rightNode);
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

        preOrderTraverse(root);
    }
}
