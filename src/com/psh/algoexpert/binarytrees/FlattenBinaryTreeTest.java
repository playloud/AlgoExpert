package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlattenBinaryTreeTest {
    @Test
    public void flattenBintree() {
        var root = new FlattenBinaryTree.BinaryTree(5);
        root.right = new FlattenBinaryTree.BinaryTree(7);

        root.left = new FlattenBinaryTree.BinaryTree(2);
        root.left.left = new FlattenBinaryTree.BinaryTree(1);
        root.left.right = new FlattenBinaryTree.BinaryTree(3);

        root.right.left = new FlattenBinaryTree.BinaryTree(6);
        root.right.right = new FlattenBinaryTree.BinaryTree(13);

        var result = FlattenBinaryTree.flattenBinaryTree(root);
        var node = result;

        while(true) {
            System.out.println(node.value);
            if(node.right != null) {
                node = node.right;
            } else {
                break;
            }
        }

    }

}