package com.psh.leetcode.amazon;

import com.sun.source.tree.Tree;

import java.util.*;

public class BoundaryofBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        var result = new ArrayList<Integer>();
        var resultNodes = new ArrayList<TreeNode>();

        resultNodes.add(root);

        if(root.left != null) {
            searchLeft(root.left, resultNodes);
        }

        dfsLeafs(root, resultNodes, root);

        var rigntParts = new ArrayList<TreeNode>();
        if(root.right != null) {
            searchRight(root.right, rigntParts);
        }

        rigntParts.forEach(a->resultNodes.add(a));

        resultNodes.forEach(a->{
            result.add(a.val);
        });
        return result;
    }

    //
    public void searchLeft(TreeNode node, ArrayList<TreeNode> hist) {
        if(node.left != null || node.right != null)
            hist.add(node);

        if(node.left != null) {
            searchLeft(node.left, hist);
        } else if(node.left == null && node.right != null) {
            searchLeft(node.right, hist);
        }
    }

    public void dfsLeafs(TreeNode node, ArrayList<TreeNode> hist, TreeNode root) {

        if(node.left != null) {
            dfsLeafs(node.left, hist, root);
        }

        if(node.left == null && node.right == null && node!=root)
            hist.add(node);

        if(node.right != null) {
            dfsLeafs(node.right, hist, root);
        }
    }

    public void searchRight(TreeNode node, ArrayList<TreeNode> hist) {
        if(node.left != null || node.right != null){
            hist.add(0, node);
        }
        if(node.right != null) {
            searchRight(node.right, hist);
        } else if(node.right == null && node.left != null) {
            searchRight(node.left, hist);
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

        @Override
        public String toString() {
            return val+"";
        }
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
}
