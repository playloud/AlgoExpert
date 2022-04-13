package com.psh.algoexpert.binarytrees;
import java.util.*;
public class FindKthLargestValueInBST {

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        var arr = new ArrayList<BST>();
        inorderSearch(tree, arr);
        if(arr.size()>0 && (arr.size()-k) < arr.size())
            return arr.get(arr.size()-k).value;
        return -1;
    }

    public void inorderSearch(BST node, ArrayList<BST> nodes) {
        if(node.left != null) inorderSearch(node.left, nodes);
        nodes.add(node);
        if(node.right != null) inorderSearch(node.right, nodes);
    }

}
