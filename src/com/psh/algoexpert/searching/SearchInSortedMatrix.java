package com.psh.algoexpert.searching;

public class SearchInSortedMatrix {

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int i, j;
        i = 0;
        j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[]{i, j};
            } else if (target < matrix[i][j]) {
                j--;
            } else if (target > matrix[i][j]) {
                i++;
            }
            //System.out.println(String.format("%d %d", i, j));
        }
        return new int[]{-1, -1};
    }
}
