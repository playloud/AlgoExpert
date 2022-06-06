package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllNodesDistanceKinBinaryTreeTest {

    @Test
    public void test01() {
        var root = new AllNodesDistanceKinBinaryTree.TreeNode(3);
        root.left = new AllNodesDistanceKinBinaryTree.TreeNode(5);
        root.left.left = new AllNodesDistanceKinBinaryTree.TreeNode(6);
        root.left.right = new AllNodesDistanceKinBinaryTree.TreeNode(2);
        root.left.right.left = new AllNodesDistanceKinBinaryTree.TreeNode(7);
        root.left.right.right = new AllNodesDistanceKinBinaryTree.TreeNode(4);

        root.right = new AllNodesDistanceKinBinaryTree.TreeNode(1);
        root.right.left = new AllNodesDistanceKinBinaryTree.TreeNode(0);
        root.right.right = new AllNodesDistanceKinBinaryTree.TreeNode(8);

        var app = new AllNodesDistanceKinBinaryTree();
        var result = app.distanceK(root, root.left, 6);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var root = new AllNodesDistanceKinBinaryTree.TreeNode(3);
        root.left = new AllNodesDistanceKinBinaryTree.TreeNode(5);
        root.left.left = new AllNodesDistanceKinBinaryTree.TreeNode(6);
        root.left.right = new AllNodesDistanceKinBinaryTree.TreeNode(2);
        root.left.right.left = new AllNodesDistanceKinBinaryTree.TreeNode(7);
        root.left.right.right = new AllNodesDistanceKinBinaryTree.TreeNode(4);

        root.right = new AllNodesDistanceKinBinaryTree.TreeNode(1);
        root.right.left = new AllNodesDistanceKinBinaryTree.TreeNode(0);
        root.right.right = new AllNodesDistanceKinBinaryTree.TreeNode(8);

        var app = new AllNodesDistanceKinBinaryTree();
        var result = app.distanceK(root, root.left, 0);
        System.out.println(result);
    }

}