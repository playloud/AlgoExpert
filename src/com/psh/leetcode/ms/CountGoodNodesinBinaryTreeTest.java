package com.psh.leetcode.ms;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountGoodNodesinBinaryTreeTest {

    @Test
    public void test01() {
        var app = new CountGoodNodesinBinaryTree();
        var root = new CountGoodNodesinBinaryTree.TreeNode(3);
        root.left = new CountGoodNodesinBinaryTree.TreeNode(1);
        root.left.left = new CountGoodNodesinBinaryTree.TreeNode(3);

        root.right = new CountGoodNodesinBinaryTree.TreeNode(4);
        root.right.left = new CountGoodNodesinBinaryTree.TreeNode(1);
        root.right.right = new CountGoodNodesinBinaryTree.TreeNode(5);

        System.out.println(app.goodNodes(root));
    }

    @Test
    public void test02() {

    }

    @Test
    public void test03() {

    }

}