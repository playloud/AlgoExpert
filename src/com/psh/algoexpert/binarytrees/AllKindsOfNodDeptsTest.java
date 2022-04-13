package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllKindsOfNodDeptsTest {
    @Test
    public void testAllKindNodeDepth() {
        var root = new AllKindsOfNodDepts.BinaryTree(1);
        root.left = new AllKindsOfNodDepts.BinaryTree(2);
        root.right = new AllKindsOfNodDepts.BinaryTree(3);

        root.left.left = new AllKindsOfNodDepts.BinaryTree(4);
        root.left.right = new AllKindsOfNodDepts.BinaryTree(5);
        root.right.left = new AllKindsOfNodDepts.BinaryTree(6);
        root.right.right = new AllKindsOfNodDepts.BinaryTree(7);

        root.left.left.left = new AllKindsOfNodDepts.BinaryTree(8);
        root.left.left.right = new AllKindsOfNodDepts.BinaryTree(9);

        var result = AllKindsOfNodDepts.allKindsOfNodeDepths(root);
        System.out.println(result);
    }

}