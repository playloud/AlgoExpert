package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximizeExpressionTest {
    @Test
    public void testMaximizeExp() {
        int[] input = {3, 6, 1, -3, 2, 7};
        var app = new MaximizeExpression();
        var result = app.maximizeExpression(input);
        System.out.println(result);
    }

}