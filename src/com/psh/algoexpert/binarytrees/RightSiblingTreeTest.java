package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class RightSiblingTreeTest {

    @Test
    public void testRightSibling() {

    }

    @Test
    public void testNull() {
        // null is acceptable
        var arr = new ArrayList<RightSiblingTree.BinaryTree>();
        arr.add(null);
        arr.add(null);
        arr.add(new RightSiblingTree.BinaryTree(123));
        for (RightSiblingTree.BinaryTree bt : arr) {
            if(bt != null) System.out.println(bt.value);
            else System.out.println(bt);
        }
        System.out.println(arr.size());
    }

    @Test
    public void testNull2() {
        var arr = new ArrayDeque<RightSiblingTree.BinaryTree>();
        arr.add(null);
        arr.add(null);
        arr.add(new RightSiblingTree.BinaryTree(123));
        for (RightSiblingTree.BinaryTree bt : arr) {
            if(bt != null) System.out.println(bt.value);
            else System.out.println(bt);
        }
        System.out.println(arr.size());
    }

}