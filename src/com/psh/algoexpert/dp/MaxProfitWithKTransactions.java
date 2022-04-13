package com.psh.algoexpert.dp;
import java.util.*;
public class MaxProfitWithKTransactions {
    static int maxProfit;
    public static int maxProfitWithKTransactions(int[] prices, int k) {

        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;

        maxProfit = Integer.MIN_VALUE;
        mySol(k, 0, 0, 0, prices);

        if(maxProfit < 0)
            return 0;

        return maxProfit;
    }

    public static void mySol(int remainingTrax, int buyin, int profit, int day, int[] prices) {
        if(day>=prices.length) return;

        // buy
        if(buyin == 0 && remainingTrax > 0) {
            int buyPrice = prices[day];
            mySol(remainingTrax, buyPrice, profit, (day+1), prices);
        }

        // do nothing
        mySol(remainingTrax, buyin, profit, (day+1), prices);

        // sell
        if(buyin > 0) {
            int sellPrice = prices[day];
            int curProfit = (sellPrice - buyin);
            if(maxProfit < (curProfit+profit)) {
                maxProfit = (curProfit+profit);
            }
            mySol(remainingTrax-1, 0, (profit+curProfit), (day+1), prices);
        }
    }
}
