package com.psh.algoexpert.dp;
import java.util.*;

public class MaximumSumSubmatrix {

    public int maximumSumSubmatrix(int[][] matrix, int size) {
        int maxSize = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length - size + 1; i++) {
            for (int j = 0; j < matrix[i].length - size + 1; j++) {
                int sum = getSize(i, j, size, matrix);
                if(maxSize < sum)
                    maxSize = sum;
            }
        }
        return maxSize;
    }

    public int getSize(int i, int j, int size, int[][] matrix) {
        int sum = 0;
        for (int k = i; k < i + size; k++) {
            for (int l = j; l < j + size; l++) {
                sum += matrix[k][l];
            }
        }
        return sum;
    }
}
