package com.psh.algoexpert.binarytrees;

public class NodeDepths {

    public static int count = 0;
    public static int nodeDepths(BinaryTree root) {
        count = 0;
        if(root !=null)
            countDepth(root, 0);
        return count;
    }

    public static void countDepth(BinaryTree node, int curCount) {
        count += curCount;

        if(node.left != null)
            countDepth(node.left, (curCount+1));

        if(node.right != null)
            countDepth(node.right, (curCount+1));
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
