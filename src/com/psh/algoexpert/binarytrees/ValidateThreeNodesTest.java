package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateThreeNodesTest {

    @Test
    public void testValidateThreeNodes() {
        var root = new ValidateThreeNodes.BST(10);
        root.left = new ValidateThreeNodes.BST(5);
        root.left.left = new ValidateThreeNodes.BST(2);
        root.left.right = new ValidateThreeNodes.BST(5);
        root.left.left.left = new ValidateThreeNodes.BST(1);

        root.right = new ValidateThreeNodes.BST(15);
        root.right.right = new ValidateThreeNodes.BST(22);

        var app = new ValidateThreeNodes();
        var result = app.validateThreeNodes(root, root.left, root.left.left.left);
        System.out.println(result);

        var result2 = app.validateThreeNodes(root, root.left, root.left.left.left);
        System.out.println(result2);

    }

}