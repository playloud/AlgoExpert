package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBSTTest {
    @Test
    public void testValidateBST() {
        var root = new ValidateBST.BST(10);
        root.left = new ValidateBST.BST(5);
        root.left.left = new ValidateBST.BST(2);
        root.left.left.left = new ValidateBST.BST(1);
        root.left.right = new ValidateBST.BST(5);
        root.left.right.right = new ValidateBST.BST(11);

        root.right = new ValidateBST.BST(15);
        root.right.left = new ValidateBST.BST(13);
        root.right.left.right = new ValidateBST.BST(14);
        root.right.right = new ValidateBST.BST(22);

        var result = ValidateBST.validateBst(root);
        System.out.println(result);
    }

}