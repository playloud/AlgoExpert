package com.psh.algoexpert.binarytrees;

import java.util.ArrayDeque;

public class AllKindsOfNodDepts {
    public static int allKindsOfNodeDepths(BinaryTree root) {
        var q = new ArrayDeque<BinaryTree>();
        q.add(root);
        int sum = 0;
        while(q.size() > 0) {
            var n = q.remove();
            sum += getAllDepth(n);
            if(n.left != null) {
                q.add(n.left);
            }

            if(n.right != null) {
                q.add(n.right);
            }
        }
        return sum;
    }

    public static int getAllDepth(BinaryTree node) {

        int depth = 0;
        int sum = 0;
        var q = new ArrayDeque<BinaryTree>();
        q.add(node);
        while(q.size() > 0) {
            depth ++;
            var tempQ = new ArrayDeque<BinaryTree>();
            while(q.size() > 0) {
                var n = q.remove();
                if(n.left != null) {
                    sum += depth;
                    tempQ.add(n.left);
                }

                if(n.right != null) {
                    sum+= depth;
                    tempQ.add(n.right);
                }
            }
            q = tempQ;
        }
        return sum;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

}
