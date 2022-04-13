package com.psh.algoexpert.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonConstructibleChangeTest {

    @Test
    public void testNonConstr() {
        int[] coins = {5,7,1,1,2,3,22};
        var app = new NonConstructibleChange();
        var result = app.nonConstructibleChange(coins);
        System.out.println(result);

    }

    @Test
    public void testNonConstr1() {
        int[] coins = {1, 1, 1, 1, 1};
        var app = new NonConstructibleChange();
        var result = app.nonConstructibleChange(coins);
        System.out.println(result);

    }

    @Test
    public void testNonConstr2() {
        int[] coins = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        var app = new NonConstructibleChange();
        var result = app.nonConstructibleChange(coins);
        System.out.println(result);

    }

    @Test
    public void testNonConstr3() {
        int[] coins = {1,2,3,4,5,6,7};
        var app = new NonConstructibleChange();
        var result = app.nonConstructibleChange(coins);
        System.out.println(result);

    }

}