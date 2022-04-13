package com.psh.algoexpert.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitWithKTransactionsTest {
    @Test
    public void testMaxProfit() {
        int[] prices = {5, 11, 3, 50, 60, 90};
        int k = 2;
        int result = MaxProfitWithKTransactions.maxProfitWithKTransactions(prices,k);
        System.out.println(result);
    }

}