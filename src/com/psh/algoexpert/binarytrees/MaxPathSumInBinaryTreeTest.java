package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPathSumInBinaryTreeTest {
    @Test
    public void testMaxPath() {
        MaxPathSumInBinaryTree.BinaryTree root = new MaxPathSumInBinaryTree.BinaryTree(1);
        root.left = new MaxPathSumInBinaryTree.BinaryTree(2);
        root.right = new MaxPathSumInBinaryTree.BinaryTree(3);

        root.left.left = new MaxPathSumInBinaryTree.BinaryTree(4);
        root.left.right = new MaxPathSumInBinaryTree.BinaryTree(5);

        root.right.left = new MaxPathSumInBinaryTree.BinaryTree(6);
        root.right.right = new MaxPathSumInBinaryTree.BinaryTree(7);

        var result = MaxPathSumInBinaryTree.maxPathSum(root);
        System.out.println(result);

    }

}