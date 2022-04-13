package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfWaysToTraverseGraphTest {

    @Test
    public void testNumberOfWays() {
        var app = new NumberOfWaysToTraverseGraph();
        var result = app.numberOfWaysToTraverseGraph(4,4);
        System.out.println(result);
    }

}