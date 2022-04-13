package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BranchSumsTest {

    @Test
    public void testBranchSumTest() {
        BranchSums.BinaryTree root = new BranchSums.BinaryTree(1);
        root.left = new BranchSums.BinaryTree(2);
        root.right = new BranchSums.BinaryTree(3);
        root.left.left = new BranchSums.BinaryTree(4);
        root.left.right = new BranchSums.BinaryTree(5);
        root.left.left.left = new BranchSums.BinaryTree(8);
        root.left.left.right = new BranchSums.BinaryTree(9);
        root.left.right.left = new BranchSums.BinaryTree(10);

        root.right.left = new BranchSums.BinaryTree(6);
        root.right.right = new BranchSums.BinaryTree(7);

        System.out.println(BranchSums.branchSums(root));


    }

}