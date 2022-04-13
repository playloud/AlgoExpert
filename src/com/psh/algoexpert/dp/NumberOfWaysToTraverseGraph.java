package com.psh.algoexpert.dp;

import com.psh.algoexpert.Util;

public class NumberOfWaysToTraverseGraph {

    public int numberOfWaysToTraverseGraph(int width, int height) {

        if(width <= 0 || height <= 0) return 0;

        int[][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if(i==0 || j==0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
                }
            }
        }
        return matrix[width-1][height-1];
    }


}
