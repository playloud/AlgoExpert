package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapSackProblemTest {

    @Test
    public void testKnapsack() {
        int[][] input = {
            {1, 2},
            {4, 3},
            {5, 6},
            {6, 7}
        };
        int cap = 10;
        KnapSackProblem.knapsackProblem(input, cap);

    }

    @Test
    public void testKnapsack2() {
        int[][] input = {
                {1, 2},
                {4, 3},
                {5, 6},
                {6, 7}
        };
        int cap = 0;
        var result = KnapSackProblem.knapsackProblem(input, cap);
        System.out.println(result);

    }

}