package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoundaryofBinaryTreeTest {

    @Test
    public void test01() {
        var root = new BoundaryofBinaryTree.TreeNode(1);
        root.left = new BoundaryofBinaryTree.TreeNode(2);
        root.left.left = new BoundaryofBinaryTree.TreeNode(4);
        root.left.right = new BoundaryofBinaryTree.TreeNode(5);
        root.left.right.left = new BoundaryofBinaryTree.TreeNode(7);
        root.left.right.right = new BoundaryofBinaryTree.TreeNode(8);

        root.right = new BoundaryofBinaryTree.TreeNode(3);
        root.right.left = new BoundaryofBinaryTree.TreeNode(6);
        root.right.left.left = new BoundaryofBinaryTree.TreeNode(9);
        root.right.left.right = new BoundaryofBinaryTree.TreeNode(10);

        var app = new BoundaryofBinaryTree();
        var result = app.boundaryOfBinaryTree(root);
        System.out.println(result);

    }

    @Test
    public void test02() {
        var root = new BoundaryofBinaryTree.TreeNode(1);
        root.right = new BoundaryofBinaryTree.TreeNode(2);
        root.right.left = new BoundaryofBinaryTree.TreeNode(3);
        root.right.right = new BoundaryofBinaryTree.TreeNode(4);

        var app = new BoundaryofBinaryTree();
        var result = app.boundaryOfBinaryTree(root);
        System.out.println(result);

    }

    @Test
    public void test03() {
        var root = new BoundaryofBinaryTree.TreeNode(1);

        var app = new BoundaryofBinaryTree();
        var result = app.boundaryOfBinaryTree(root);
        System.out.println(result);

    }

}