package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import static org.junit.Assert.*;

public class BSTConstructionTest {

    @Test
    public void testBSTConstruction() {
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.insert(5);
        root.insert(15);
        root.insert(2);
        root.insert(5);
        root.insert(13);
        root.insert(22);
        root.insert(14);
        root.insert(1);
        root.remove(13);
        int var = 10;
    }

    @Test
    public void testBSTConstruction2() {
        BSTConstruction.BST root = new BSTConstruction.BST(1);
        root.insert(2);
        root.insert(3);
        root.insert(4);
        root.insert(5);
        root.remove(1);
        int var = 10;
    }

    @Test
    public void testBSTConstruction3() {
        BSTConstruction.BST root = new BSTConstruction.BST(10);
        root.insert(5);
        root.insert(15);
        root.remove(5);
        root.remove(15);
        root.remove(10);
        int var = 10;
    }

}