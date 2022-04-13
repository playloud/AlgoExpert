package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BSTTraversalTest {

    @Test
    public void testBSTTraverse() {
        var root = new BSTTraversal.BST(10);
        root.left = new BSTTraversal.BST(5);
        root.left.left = new BSTTraversal.BST(2);
        root.left.right = new BSTTraversal.BST(5);
        root.left.left.left = new BSTTraversal.BST(1);

        root.right = new BSTTraversal.BST(15);
        root.right.right = new BSTTraversal.BST(22);

        ArrayList<Integer> arr = new ArrayList<>();
        var result = BSTTraversal.inOrderTraverse(root, arr);
        System.out.println(result);

        arr = new ArrayList<>();
        var resultPre = BSTTraversal.preOrderTraverse(root, arr);
        System.out.println(resultPre);

        arr = new ArrayList<>();
        var resultPost = BSTTraversal.postOrderTraverse(root, arr);
        System.out.println(resultPost);


    }

}