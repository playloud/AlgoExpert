package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class IterativeInOrderTraversalTest {
    @Test
    public void testInterative() {
        IterativeInOrderTraversal.BinaryTree root = new IterativeInOrderTraversal.BinaryTree(1);
        root.left = new IterativeInOrderTraversal.BinaryTree(2);
        root.right = new IterativeInOrderTraversal.BinaryTree(3);

        root.left.left = new IterativeInOrderTraversal.BinaryTree(4);
        root.left.right = new IterativeInOrderTraversal.BinaryTree(9);

        root.right.right = new IterativeInOrderTraversal.BinaryTree(7);
        root.right.left = new IterativeInOrderTraversal.BinaryTree(6);
        Function<IterativeInOrderTraversal.BinaryTree, Void> func = x-> {
            System.out.println(x.value);
            return null;
        };
        IterativeInOrderTraversal.iterativeInOrderTraversal(root,func);
    }

}