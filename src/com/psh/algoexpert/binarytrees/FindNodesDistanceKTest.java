package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNodesDistanceKTest {

    @Test
    public void testFindNodesDist() {
        var root = new FindNodesDistanceK.BinaryTree(1);
        root.left = new FindNodesDistanceK.BinaryTree(2);
        root.right = new FindNodesDistanceK.BinaryTree(3);
        root.left.left = new FindNodesDistanceK.BinaryTree(4);
        root.right.left = new FindNodesDistanceK.BinaryTree(5);
        root.right.right = new FindNodesDistanceK.BinaryTree(6);
        root.right.right.right = new FindNodesDistanceK.BinaryTree(7);
        root.right.right.right.right = new FindNodesDistanceK.BinaryTree(8);

        var app = new FindNodesDistanceK();
        var result = app.findNodesDistanceK(root,8, 6);
        System.out.println(result);
    }

}