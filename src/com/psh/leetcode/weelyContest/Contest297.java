package com.psh.leetcode.weelyContest;

public class Contest297 {


    public double calculateTax(int[][] brackets, int income) {
        double result = 0;

        boolean lastHit = false;
        double temp = 0;
        for (int i = 0; i < brackets.length; i++) {
            int[] cur = brackets[i];
            int maxp = cur[0];
            int perc = cur[1];

            if (maxp < income) {
                // if there is prev income?
                int intSrc = 0;
                if (i > 0) {
                    intSrc = (maxp - brackets[i - 1][0]);
                } else {
                    intSrc = maxp;
                }
                temp = (double) (intSrc * perc) / 100;
                result += temp;
                //System.out.println(temp);
            } else {
                if (!lastHit) {
                    int intSrc = 0;
                    if (i > 0) {
                        intSrc = (Math.min(maxp, income) - brackets[i - 1][0]);
                    } else {
                        intSrc = Math.min(maxp, income);
                    }
                    temp = (double) (intSrc * perc) / 100;
                    result += temp;
                    // System.out.println(temp);
                    lastHit = true;
                }
            }
        }

        return result;
    }

    int minPath = 0;
    public int minPathCost(int[][] grid, int[][] moveCost) {
        minPath = Integer.MAX_VALUE;
        int n = grid[0].length;
        for (int i = 0; i < n; i++) {
            searchMinPath(grid, moveCost, 0, i, 0);
        }
        return minPath;
    }

    public void searchMinPath(int[][] grid, int[][] moveCost, int i, int j, int curCost) {
        if (curCost > minPath)
            return;

        int curValue = grid[i][j];
        curCost += curValue;
        if (i == grid.length - 1) {
            minPath = Math.min(curCost, minPath);
            return;
        }

        int n = grid[0].length;

        int minIndex = -1;
        int minNext = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) {
            minNext = moveCost[curValue][k];
            searchMinPath(grid, moveCost, i + 1, k, (curCost + minNext));
        }





//        //to zero
//        int next0 = moveCost[curValue][0];
//        searchMinPath(grid, moveCost, i + 1, 0, (curCost + next0));
//
//        //to one
//        int next1 = moveCost[curValue][1];
//        searchMinPath(grid, moveCost, i + 1, 1, (curCost + next1));

    }


    public int distributeCookies(int[] cookies, int k) {
        int result = 0;


        return result;
    }
}
