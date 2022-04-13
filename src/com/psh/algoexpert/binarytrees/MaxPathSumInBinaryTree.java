package com.psh.algoexpert.binarytrees;
import java.util.*;
public class MaxPathSumInBinaryTree {
    static int maxSum = Integer.MIN_VALUE;
    public static int maxPathSum(BinaryTree tree) {
        maxSum = Integer.MIN_VALUE;
        var allNodes = new ArrayList<BinaryTree>();
        var cpMap = new HashMap<BinaryTree, BinaryTree>();
        var pathes = new HashSet<BinaryTree>();

        // depth first search
        allNodes.add(tree);
        explore(tree, allNodes, cpMap);

        // start recursion
        for (int i = 0; i < allNodes.size(); i++) {
            BinaryTree node = allNodes.get(i);
            pathes.clear();
            pathes.add(node);
            findMax(node, 0, pathes, cpMap);
        }
        return maxSum;
    }
    public static void explore(BinaryTree node, ArrayList<BinaryTree> allNodes, HashMap<BinaryTree, BinaryTree> cpMap) {
        if(node.left != null) {
            allNodes.add(node.left);
            cpMap.put(node.left, node);
            explore(node.left, allNodes, cpMap);
        }
        if(node.right != null) {
            allNodes.add(node.right);
            cpMap.put(node.right, node);
            explore(node.right, allNodes, cpMap);
        }
    }
    public static void findMax(BinaryTree node, int sum, HashSet<BinaryTree> path,
                               HashMap<BinaryTree, BinaryTree> cpMap) {
        int curSum = sum + node.value;

        if(maxSum < curSum) {
            maxSum = curSum;
        }

        if(node.right != null) {
            if(!path.contains(node.right)) {
                path.add(node.right);
                findMax(node.right, (sum+node.value), path, cpMap);
                path.remove(node.right);
            }
        }

        if(node.left != null) {
            if(!path.contains(node.left)) {
                path.add(node.left);
                findMax(node.left, (sum+node.value), path, cpMap);
                path.remove(node.left);
            }
        }

        if(cpMap.containsKey(node)) {
            var parent = cpMap.get(node);
            if(!path.contains(parent)) {
                path.add(parent);
                findMax(parent, (sum+node.value), path, cpMap);
                path.remove(parent);
            }
        }
    }
    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
