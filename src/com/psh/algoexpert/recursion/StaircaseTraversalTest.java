package com.psh.algoexpert.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseTraversalTest {

    @Test
    public void testTraverse() {
        var app = new StaircaseTraversal();
        var result = app.staircaseTraversal(4,2);
        System.out.println(result);
    }

}