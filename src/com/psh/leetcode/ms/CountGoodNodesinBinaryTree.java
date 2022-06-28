package com.psh.leetcode.ms;

public class CountGoodNodesinBinaryTree {
    int count = 0;
    public int goodNodes(TreeNode root) {
        count = 0;
        findGood(root, Integer.MIN_VALUE);
        return count;
    }

    public void findGood(TreeNode n, int beforeMax) {
        if(n.val >= beforeMax) count++;
        if(n.left != null) {
            findGood(n.left, Math.max(n.val, beforeMax));
        }
        if(n.right != null) {
            findGood(n.right, Math.max(n.val, beforeMax));
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
