package com.psh.algoexpert.binarytrees;

import java.util.*;
import java.util.function.Function;

public class IterativeInOrderTraversal {

    public static void iterativeInOrderTraversal( BinaryTree tree, Function<BinaryTree, Void> callback) {
        BinaryTree cur = null;
        cur = tree;
        var stack = new Stack<BinaryTree>();
        while(cur!=null || stack.size() > 0) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BinaryTree n = stack.pop();
            callback.apply(n);
            if(n.right != null) {
                stack.push(n.right);
                cur = n.right.left;//keypoint
            }
        }

    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;
        public BinaryTree parent;

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree parent) {
            this.value = value;
            this.parent = parent;
        }
    }

}
