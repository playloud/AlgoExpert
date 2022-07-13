package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareLeafTraversalTest {

    @Test
    public void testCompareLeaf() {
        var root1 = new CompareLeafTraversal.BinaryTree(1);
        root1.left = new CompareLeafTraversal.BinaryTree(2);
        root1.left.left = new CompareLeafTraversal.BinaryTree(4);
        root1.left.right = new CompareLeafTraversal.BinaryTree(5);
        root1.left.right.left = new CompareLeafTraversal.BinaryTree(7);
        root1.left.right.right = new CompareLeafTraversal.BinaryTree(8);

        root1.right = new CompareLeafTraversal.BinaryTree(3);
        root1.right.right = new CompareLeafTraversal.BinaryTree(6);


        var root2 = new CompareLeafTraversal.BinaryTree(1);
        root2.left = new CompareLeafTraversal.BinaryTree(2);
        root2.left.left = new CompareLeafTraversal.BinaryTree(4);
        root2.left.right = new CompareLeafTraversal.BinaryTree(7);

        root2.right = new CompareLeafTraversal.BinaryTree(3);
        root2.right.right = new CompareLeafTraversal.BinaryTree(5);
        root2.right.right.left = new CompareLeafTraversal.BinaryTree(8);
        root2.right.right.right = new CompareLeafTraversal.BinaryTree(6);

        var app = new CompareLeafTraversal();
        var result = app.compareLeafTraversal(root1, root2);
        ;
        System.out.println(result);


    }

    @Test
    public void traverseTest() {
        var root1 = new CompareLeafTraversal.BinaryTree(1);
        root1.left = new CompareLeafTraversal.BinaryTree(2);
        root1.left.left = new CompareLeafTraversal.BinaryTree(4);
        root1.left.right = new CompareLeafTraversal.BinaryTree(5);
        root1.left.right.left = new CompareLeafTraversal.BinaryTree(7);
        root1.left.right.right = new CompareLeafTraversal.BinaryTree(8);

        root1.right = new CompareLeafTraversal.BinaryTree(3);
        root1.right.left = new CompareLeafTraversal.BinaryTree(11);
        root1.right.right = new CompareLeafTraversal.BinaryTree(6);


        var root2 = new CompareLeafTraversal.BinaryTree(1);
        root2.left = new CompareLeafTraversal.BinaryTree(2);
        root2.left.left = new CompareLeafTraversal.BinaryTree(4);
        root2.left.right = new CompareLeafTraversal.BinaryTree(7);

        root2.right = new CompareLeafTraversal.BinaryTree(3);
        root2.right.right = new CompareLeafTraversal.BinaryTree(5);
        root2.right.right.left = new CompareLeafTraversal.BinaryTree(8);
        root2.right.right.right = new CompareLeafTraversal.BinaryTree(6);

        var app = new CompareLeafTraversal();
        app.preOrder(root1);
        System.out.println();
        app.inOrder(root1);

    }

}