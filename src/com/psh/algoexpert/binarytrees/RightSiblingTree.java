package com.psh.algoexpert.binarytrees;

import java.util.ArrayList;

public class RightSiblingTree {

    public static BinaryTree rightSiblingTree(BinaryTree root) {

        var globalArr = new ArrayList<ArrayList<BinaryTree>>();
        var myQ = new ArrayList<BinaryTree>();
        myQ.add(root);
        var fisrtArr = new ArrayList<BinaryTree>();
        fisrtArr.add(root);
        globalArr.add(fisrtArr);

        //build global arr - breadth search
        while(myQ.size() > 0) {
            var tempQ = new ArrayList<BinaryTree>();
            var tempArr = new ArrayList<BinaryTree>();
            boolean isAllNull = true;
            while(myQ.size() > 0) {
                var node = myQ.remove(0);
                if(node == null) {
                    tempArr.add(null);
                    tempArr.add(null);
                    tempQ.add(null);
                    tempQ.add(null);
                } else {
                    isAllNull = false;
                    tempArr.add(node.left);
                    tempArr.add(node.right);
                    tempQ.add(node.left);
                    tempQ.add(node.right);
                }
            }
            if(isAllNull)
                break;
            myQ = tempQ;
            globalArr.add(tempArr);
        }

        for (ArrayList<BinaryTree> arr : globalArr) {
            for (int i = 0; i < arr.size(); i++) {
                var node = arr.get(i);
                if(node == null) continue;
                if(i+1 < arr.size()) {
                    var next = arr.get(i+1);
                    if(next != null) {
                        node.right = next;
                    } else {
                        node.right = null;
                    }
                } else {
                    node.right = null;
                }
            }
        }
        return root;
    }

    // This is the class of the input root. Do not edit it.
    static class BinaryTree {
        int value;
        BinaryTree left = null;
        BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}
