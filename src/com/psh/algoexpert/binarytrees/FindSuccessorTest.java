package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindSuccessorTest {

    @Test
    public void testFindSuccessor() {
        var root = new FindSuccessor.BinaryTree(1);
        root.left = new FindSuccessor.BinaryTree(2);
        root.left.right = new FindSuccessor.BinaryTree(5);
        root.left.left = new FindSuccessor.BinaryTree(4);
        root.left.left.left = new FindSuccessor.BinaryTree(6);

        root.right = new FindSuccessor.BinaryTree(3);

        var app = new FindSuccessor();
        var result = app.findSuccessor(root, root.left.right);
        System.out.println("result: "+result.value);

    }

    @Test
    public void testFindSuccessor2() {
        var root = new FindSuccessor.BinaryTree(1);
        root.left = new FindSuccessor.BinaryTree(2);

        root.left.right = new FindSuccessor.BinaryTree(5);
        root.left.left = new FindSuccessor.BinaryTree(4);

        root.left.right.left = new FindSuccessor.BinaryTree(6);
        root.left.right.right = new FindSuccessor.BinaryTree(7);
        root.left.right.right.left = new FindSuccessor.BinaryTree(8);

        root.right = new FindSuccessor.BinaryTree(3);

        var app = new FindSuccessor();
        var result = app.findSuccessor(root, root.left.right);
        System.out.println("result: "+result.value);

    }

}