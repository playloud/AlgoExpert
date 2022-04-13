package com.psh.algoexpert.binarytrees;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ValidateBST {

    public static boolean validateBst(BST tree) {

        BST cur = tree;
        var myQ = new ArrayDeque<BST>();
        var cpMap = new HashMap<BST, BST>();
        var metaMap = new HashMap<BST, Meta>();
        var leafQ = new ArrayDeque<BST>();
        myQ.add(cur);
        // build cpMap, leafQ, metaMap
        while(myQ.size() > 0) {
            var node = myQ.remove();
            metaMap.put(node, new Meta());
            if(node.left != null) {
                cpMap.put(node.left, node);
                myQ.add(node.left);
            }

            if(node.right != null) {
                cpMap.put(node.right, node);
                myQ.add(node.right);
            }

            if(node.right == null && node.left == null) {
                leafQ.add(node);
            }
        }

        while(leafQ.size() > 0) {
            BST node = leafQ.remove();

            if(cpMap.containsKey(node)) {
                BST parent = cpMap.get(node);
                if(parent.left == node) {
                    metaMap.get(parent).left.addAll(metaMap.get(node).left);
                    metaMap.get(parent).left.add(node.value);
                    metaMap.get(parent).left.addAll(metaMap.get(node).right);
                    //check left
                    if(metaMap.get(parent).left.size()>0){
                       var leftList =  metaMap.get(parent).left;
                       if(parent.value <= leftList.get(leftList.size()-1)){
                           return false;
                       }
                    }
                } else {
                    metaMap.get(parent).right.addAll(metaMap.get(node).left);
                    metaMap.get(parent).right.add(node.value);
                    metaMap.get(parent).right.addAll(metaMap.get(node).right);
                    //check right
                    if(metaMap.get(parent).right.size()>0){
                        var rightList =  metaMap.get(parent).right;
                        if(parent.value > rightList.get(0)){
                            return false;
                        }
                    }
                }
                leafQ.add(parent);
            }
        }
        return true;
    }

    static class Meta {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static boolean validateBst_wrong(BST tree) {
        BST cur = tree;
        var myQ = new ArrayDeque<BST>();
        myQ.add(cur);
        while(myQ.size() > 0) {
            var tempQ = new ArrayDeque<BST>();
            while(myQ.size() > 0) {
                var n = myQ.remove();
                if(n.left != null && n.value <= n.left.value ) return false;
                if(n.left != null ) tempQ.add(n.left);
                if(n.right != null && n.value > n.right.value ) return false;
                if(n.right != null ) tempQ.add(n.right);
            }
            myQ = tempQ;
        }
        return true;
    }
}
