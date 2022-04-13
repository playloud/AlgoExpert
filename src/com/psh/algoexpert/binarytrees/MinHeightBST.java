package com.psh.algoexpert.binarytrees;
import java.util.*;
public class MinHeightBST {

    public static BST minHeightBst(List<Integer> array) {
        BST result = null;
        if(array.size() > 2) {
            int si = 0;
            int ei = array.size()-1;
            int mid = (si+ei)/2;
            result = new BST(array.get(mid));
            mySol(si, mid-1, result, array);
            mySol(mid+1, ei, result, array);
        } else if(array.size() == 2) {
            result = new BST(array.get(0));
            result.insert(array.get(1));
        } else if(array.size() == 1) {
            result = new BST(array.get(0));
        }
        return result;
    }

    public static void mySol(int si, int ei, BST bst, List<Integer> arr) {
        if(si==ei) {
            int value = arr.get(si);
            bst.insert(value);
        } else if(si == ei-1){
            bst.insert(arr.get(si));
            bst.insert(arr.get(ei));

        } else {
            int mid = (si+ei)/2;
            bst.insert(arr.get(mid));
            mySol(si, mid-1, bst, arr);
            mySol(mid+1, ei, bst, arr);
        }
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}

