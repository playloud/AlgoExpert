package com.psh.algoexpert.binarytrees;
import java.util.*;
public class ReconstructBST {
    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        var nodes = new ArrayList<BST>();
        // build nodes
        for (int i = 0; i < preOrderTraversalValues.size(); i++) {
            int value = preOrderTraversalValues.get(i);
            nodes.add(new BST(value));
        }
        BST root = null;
        BST topNode = null;
        for (int i = 0; i < nodes.size(); i++) {
            if(i==0) {
                root = nodes.get(i);
                topNode = root;
            } else {
                var curNode = nodes.get(i);
                if(topNode.value < curNode.value) {
                    topNode.right = curNode;
                    topNode = curNode;
                } else {
                    var smallBiggerNode = getSmallBigger(nodes, i, curNode.value);
                    putNode(smallBiggerNode, curNode);
                }
            }
        }
        return root;
    }

    public void putNode(BST node, BST target) {
        if(target.value < node.value) {
            if(node.left == null) {
                node.left = target;
            } else {
                putNode(node.left, target);
            }
        } else {
            if(node.right == null) {
                node.right = target;
            } else {
                putNode(node.right, target);
            }
        }
    }

    // this is correct
    public BST getSmallBigger(ArrayList<BST> nodes, int excEnd, int value) {
        BST found = null;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < excEnd; i++) {
            if(value <= nodes.get(i).value) {
                if(nodes.get(i).value < smallest) {
                    smallest = nodes.get(i).value;
                    found = nodes.get(i);
                }
            }
        }
        return found;
    }
}
