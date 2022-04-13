//https://www.algoexpert.io/questions/Max%20Subset%20Sum%20No%20Adjacent
// PSH 01/11/22 :
// PSH 01/13/22 : passed, was busy for work
// basic idea is creating table and follow max value
// maintaining two top (below) values is the key
package com.psh.algoexpert.dp;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] array) {

        if (array.equals(null) || array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }

        Integer[][] table = null;
        int n = array.length;
        table = new Integer[n][n];

        int foundMax = Integer.MIN_VALUE;

        // build table and chasing biggest value
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j)
                    table[i][j] = array[i];

                int curValue = array[j];
                int prevIndex = j - 2;
                int preValue = 0;

                int preIndex2 = j - 3;
                int preValue2 = 0;

                if (prevIndex < 0 || prevIndex < i) {
                    preValue = 0;
                } else {
                    preValue = table[i][prevIndex];
                }

                if (preIndex2 < 0 || preIndex2 < i) {
                    preValue2 = 0;
                } else {
                    preValue2 = table[i][preIndex2];
                }

                table[i][j] = Math.max(curValue, (curValue + Math.max(preValue, preValue2)));
                foundMax = Math.max(table[i][j], foundMax);
            }
        }

        // find max
        System.out.println(String.format("max value: %d", foundMax));

        // Write your code here.
        return foundMax;
    }

}
