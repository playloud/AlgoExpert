//https://www.algoexpert.io/questions/Invert%20Binary%20Tree
// PSH 01/19/22 : passed without creating tests
package com.psh.algoexpert.binarytrees;

public class InvertBinaryTree {

    public static void invertBinaryTree(BinaryTree tree) {
        if(tree !=null) {
            swap(tree);
        }
    }

    public static void swap(BinaryTree node) {
        if(node.left != null || node.right != null) {
            var temp = node.right;
            node.right = node.left;
            node.left = temp;
        }

        if(node.left != null)
            swap(node.left);
        if(node.right != null)
            swap(node.right);
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
