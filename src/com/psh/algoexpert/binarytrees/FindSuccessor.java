package com.psh.algoexpert.binarytrees;

public class FindSuccessor {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static BinaryTree successor = null;
    public static boolean isFound = false;
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        successor = null;
        isFound = false;
        findInInorder(tree, node);
        return successor;
    }

    public static void findInInorder(BinaryTree curNode, BinaryTree targetNode) {
        if(curNode.left != null) {
            findInInorder(curNode.left, targetNode);
        }

        System.out.println(""+curNode.value);

        if(isFound){
            if(successor == null) //THIS IS IMPORTANT, only one time it should be set
                successor = curNode;
            return;
        }

        if(curNode == targetNode) {
            System.out.println("found"+curNode.value);
            isFound = true;
        }

        if(curNode.right != null) {
            findInInorder(curNode.right, targetNode);
        }
    }

}
