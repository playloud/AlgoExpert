package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeDepthsTest {

    @Test
    public void testNodeDepth() {
        NodeDepths.BinaryTree root = new NodeDepths.BinaryTree(1);
        root.left = new NodeDepths.BinaryTree(2);
        root.right = new NodeDepths.BinaryTree(3);
        root.left.left = new NodeDepths.BinaryTree(4);
        root.left.right = new NodeDepths.BinaryTree(5);
        root.left.left.left = new NodeDepths.BinaryTree(8);
        root.left.left.right = new NodeDepths.BinaryTree(9);
        root.left.right.left = new NodeDepths.BinaryTree(10);

        root.right.left = new NodeDepths.BinaryTree(6);
        root.right.right = new NodeDepths.BinaryTree(7);

        var result = NodeDepths.nodeDepths(root);
        System.out.println(result);
    }

}