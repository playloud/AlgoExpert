// PSH 01/22/22 :  easy one
//https://www.algoexpert.io/questions/Minimum%20Waiting%20Time
package com.psh.algoexpert.greedy;

import java.util.Arrays;

public class MinimumWaitingTime {

    public int minimumWaitingTime(int[] queries) {
        int result = 0;

        if(queries == null || queries.length == 0 || queries.length == 1) return 0;

        Arrays.sort(queries);
        int[] wt = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if(i == 0)
                wt[i] = 0;
            else {
                wt[i] = queries[i-1] + wt[i-1];
            }
        }
        result = Arrays.stream(wt).sum();

        return result;
    }

}
