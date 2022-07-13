package com.psh.algoexpert.binarytrees;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareLeafTraversal {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2) {

        var leafList1 = new ArrayList<BinaryTree>();
        var leafList2 = new ArrayList<BinaryTree>();

        // do dfs
        dfs(tree1, leafList1);
        dfs(tree2, leafList2);

        if(leafList1.size() != leafList2.size())
            return false;

        for (int i = 0; i < leafList1.size(); i++) {
            if(leafList1.get(i).value != leafList2.get(i).value) return false;
        }

        return true;
    }

    public void dfs(BinaryTree node, ArrayList<BinaryTree> leaves) {
        if(node.left != null) {
            dfs(node.left, leaves);
        }

        if(node.right == null && node.left == null) {
            leaves.add(node);
        }

        if(node.right != null) {
            dfs(node.right, leaves);
        }
    }

    public void preOrder(BinaryTree node) {
        if(node.left != null) {
            preOrder(node.left);
        }

        System.out.print(node.value+" ");

        if(node.right != null) {
            preOrder(node.right);
        }
    }

    public void inOrder(BinaryTree node) {
        System.out.print(node.value +" ");
        if(node.left != null)  inOrder(node.left);
        if(node.right != null)  inOrder(node.right);
    }
}
