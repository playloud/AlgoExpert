package com.psh.leetcode.amazon;
//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
//Runtime: 28 ms, faster than 5.64% of Java online submissions for All Nodes Distance K in Binary Tree.
import com.sun.source.tree.Tree;

import java.util.*;
public class AllNodesDistanceKinBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        var result = new ArrayList<Integer>();
        var cpMap = new HashMap<TreeNode, TreeNode>();
        var hist = new HashSet<TreeNode>();
        //build cp map
        buildCPMap(root, cpMap);

        if(k > 0) {
            hist.add(target);
            search(target, hist, k, result, cpMap);
        } else if (k==0){
            result.add(target.val);
        }
        return result;
    }

    public void buildCPMap(TreeNode node, HashMap<TreeNode, TreeNode> cpMap) {
        if(node.left != null) {
            cpMap.put(node.left, node);
            buildCPMap(node.left, cpMap);
        }

        if(node.right != null) {
            cpMap.put(node.right, node);
            buildCPMap(node.right, cpMap);
        }
    }

    public void search(TreeNode node, HashSet<TreeNode> history, int k, ArrayList<Integer> result, HashMap<TreeNode, TreeNode> cpMap) {
        if(node.left != null && !history.contains(node.left)) {
            if(k-1 == 0) {
                result.add(node.left.val);
            } else {
                history.add(node.left);
                search(node.left, history, k-1, result, cpMap);
                history.remove(node.left);
            }
        }

        if(node.right != null && !history.contains(node.right)) {
            if(k-1 == 0) {
                result.add(node.right.val);
            } else {
                history.add(node.right);
                search(node.right, history, k-1, result, cpMap);
                history.remove(node.right);
            }
        }

        TreeNode parent = null;
        parent = cpMap.get(node);
        if(parent != null && !history.contains(parent)) {
            if(k-1 == 0) {
                result.add(parent.val);
            } else {
                history.add(parent);
                search(parent, history, k-1, result, cpMap);
                history.remove(parent);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
