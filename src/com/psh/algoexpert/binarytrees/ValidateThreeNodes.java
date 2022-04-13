package com.psh.algoexpert.binarytrees;
import java.util.*;
public class ValidateThreeNodes {

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        if(nodeOne == nodeTwo) return false;
        if(nodeTwo == nodeThree) return false;
        if(nodeOne == nodeThree) return false;

        if(isMySub(nodeTwo, nodeOne))
            if(isMySub(nodeThree, nodeTwo))
                return true;

        if(isMySub(nodeTwo, nodeThree))
            if(isMySub(nodeOne, nodeTwo))
                return true;

        return false;
    }

    public boolean isMySub(BST root, BST node) {
        if(root == node) return false;
        BST cursor = null;
        cursor = root;
        while(cursor != null) {
            if(cursor == node) return true;
            if(node.value < cursor.value) {
                cursor = cursor.left;
            } else {
                cursor = cursor.right;
            }
        }
        return false;
    }

}
