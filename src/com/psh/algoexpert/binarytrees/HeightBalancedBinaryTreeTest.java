package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightBalancedBinaryTreeTest {

    @Test
    public void testHeightBalanace() {
        HeightBalancedBinaryTree.BinaryTree root = new HeightBalancedBinaryTree.BinaryTree(1);
        root.left = new HeightBalancedBinaryTree.BinaryTree(2);
        root.right = new HeightBalancedBinaryTree.BinaryTree(3);

        root.left.left = new HeightBalancedBinaryTree.BinaryTree(4);
        root.left.right = new HeightBalancedBinaryTree.BinaryTree(5);

        root.left.right.left = new HeightBalancedBinaryTree.BinaryTree(7);
        root.left.right.right = new HeightBalancedBinaryTree.BinaryTree(8);

        root.right.right = new HeightBalancedBinaryTree.BinaryTree(6);

        var app = new HeightBalancedBinaryTree();
        var result = app.heightBalancedBinaryTree(root);
        System.out.println(result);
    }

    @Test
    public void testHeightBalanace2() {
        HeightBalancedBinaryTree.BinaryTree root = new HeightBalancedBinaryTree.BinaryTree(1);
        root.left = new HeightBalancedBinaryTree.BinaryTree(2);
        root.right = new HeightBalancedBinaryTree.BinaryTree(3);

        root.left.left = new HeightBalancedBinaryTree.BinaryTree(4);
        root.left.right = new HeightBalancedBinaryTree.BinaryTree(7);


        root.left.left.left = new HeightBalancedBinaryTree.BinaryTree(6);

        root.right.left= new HeightBalancedBinaryTree.BinaryTree(8);
        root.right.right= new HeightBalancedBinaryTree.BinaryTree(5);

        var app = new HeightBalancedBinaryTree();
        var result = app.heightBalancedBinaryTree(root);
        System.out.println(result);
    }

}