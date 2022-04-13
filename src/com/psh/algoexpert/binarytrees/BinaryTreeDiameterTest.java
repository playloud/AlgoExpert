package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeDiameterTest {

    @Test
    public void testBinTreeDiameter() {
        var root = new BinaryTreeDiameter.BinaryTree(1);
        root.right = new BinaryTreeDiameter.BinaryTree(2);

        root.left = new BinaryTreeDiameter.BinaryTree(3);
        root.left.right = new BinaryTreeDiameter.BinaryTree(4);
        root.left.right.right = new BinaryTreeDiameter.BinaryTree(5);
        root.left.right.right.right = new BinaryTreeDiameter.BinaryTree(6);


        root.left.left = new BinaryTreeDiameter.BinaryTree(7);
        root.left.left.left = new BinaryTreeDiameter.BinaryTree(8);
        root.left.left.left.left = new BinaryTreeDiameter.BinaryTree(9);


        var app = new BinaryTreeDiameter();
        var result = app.binaryTreeDiameter(root);
        System.out.println(result);
    }

    @Test
    public void testBinTreeDiameter2() {
        var root = new BinaryTreeDiameter.BinaryTree(1);
        root.right = new BinaryTreeDiameter.BinaryTree(2);
        root.right.left = new BinaryTreeDiameter.BinaryTree(3);

        var app = new BinaryTreeDiameter();
        var result = app.binaryTreeDiameter(root);
        System.out.println(result);
    }

    @Test
    public void testBinTreeDiameter3() {
        var root = new BinaryTreeDiameter.BinaryTree(1);
        root.left = new BinaryTreeDiameter.BinaryTree(3);
        root.left.left = new BinaryTreeDiameter.BinaryTree(7);
        root.left.left.right = new BinaryTreeDiameter.BinaryTree(8);
        root.left.left.right.left = new BinaryTreeDiameter.BinaryTree(9);


        var app = new BinaryTreeDiameter();
        var result = app.binaryTreeDiameter(root);
        System.out.println(result);
    }

}