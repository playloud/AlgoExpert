package com.psh.algoexpert.binarytrees;

import java.util.ArrayDeque;

public class BinaryTreeDiameter {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {

        int maxDepth = Integer.MIN_VALUE;

        // breath search
        var queue = new ArrayDeque<BinaryTree>();
        queue.add(tree);
        while(queue.size() > 0){
            var node = queue.remove();
            int depth = getNodeRadius(node, 0) + getNodeRadius(node,1);
            if(maxDepth < depth) {
                maxDepth = depth;
            }

            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

        return maxDepth;
    }

    // 0: left, 1: right
    public int getNodeRadius(BinaryTree node, int direction) {
        if(direction == 0) {
            if(node.left == null) {
                return 0;
            } else {
                //return 1+ getNodeRadius(node.left, direction);
                return 1+ getMaxDepth(node.left);
            }
        } else {
            if(node.right == null) {
                return 0;
            } else {
                //return 1+ getNodeRadius(node.right, direction);
                return 1+ getMaxDepth(node.right);
            }
        }
    }

    public int getMaxDepth(BinaryTree node) {
        if(node.left == null && node.right == null) {
            return 0;
        } else if(node.left != null && node.right == null) {
            return 1+getMaxDepth(node.left);
        } else if(node.left == null && node.right != null) {
            return 1+getMaxDepth(node.right);
        } else {
            return 1+Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
        }
    }


}
