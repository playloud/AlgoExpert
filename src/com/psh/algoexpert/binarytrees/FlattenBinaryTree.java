package com.psh.algoexpert.binarytrees;

import java.util.*;

public class FlattenBinaryTree {

    public static BinaryTree flattenBinaryTree( BinaryTree root) {

        var queue = new ArrayDeque<BinaryTree>();
        doInorder(root, queue);

        BinaryTree curNode = null;
        BinaryTree firstNode = null;

        if(queue.size() == 1) return root;

        curNode = queue.remove();
        curNode.left = null;
        curNode.right = null;
        firstNode = curNode;

        while(queue.size() > 0) {
            var node = queue.remove();
            curNode.right = node;
            node.left = curNode;
            curNode = node;
        }

        curNode.right = null;

        return firstNode;
    }

    public static void doInorder(BinaryTree node, ArrayDeque<BinaryTree> queue) {
        if(node.left != null) {
            doInorder(node.left, queue);
        }
        queue.add(node);;
        if(node.right != null) {
            doInorder(node.right, queue);
        }
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
