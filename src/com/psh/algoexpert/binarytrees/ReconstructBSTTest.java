package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReconstructBSTTest {

    @Test
    public void testReconstBST() {
        var input = new ArrayList<Integer>();
        var app = new ReconstructBST();
        input.addAll(Arrays.asList(10, 4, 2, 1, 5, 17, 19, 18));
        var result = app.reconstructBst(input);
        System.out.println(result);
        preOrder(result);
    }

    @Test
    public void testReconstBST2() {
        var input = new ArrayList<Integer>();
        var app = new ReconstructBST();
        input.addAll(Arrays.asList(10, 4, 2, 1, 3, 5, 5, 6, 5, 5, 9, 7, 17, 19, 18, 18, 19));
        var result = app.reconstructBst(input);
        preOrder(result);
        //10, 4, 2, 1, 3, 5, 5, 6, 5, 5, 9, 7, 17, 19, 18, 18, 19
        //10   4 2 1   3 5   5   6 5  5  9  7  17 19 18 18 19
    }

    @Test
    public void testReconstBST3() {
        var input = new ArrayList<Integer>();
        var app = new ReconstructBST();
        input.addAll(Arrays.asList(2, 0, 1, 3, 4, 3));
        var result = app.reconstructBst(input);
        preOrder(result);
    }

    public void preOrder(ReconstructBST.BST root) {
        System.out.print(root.value+" ");
        if(root.left != null)
            preOrder(root.left);
        if(root.right != null)
            preOrder(root.right);
    }


}