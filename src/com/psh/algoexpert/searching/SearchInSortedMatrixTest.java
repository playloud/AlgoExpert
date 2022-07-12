package com.psh.algoexpert.searching;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInSortedMatrixTest {

    @Test
    public void test01() {
        int[][] matrix = {
                {1, 4, 7, 12, 15, 1000},
                {2, 5, 19, 31, 32, 1001},
                {3, 8, 24, 33, 35, 1002},
                {40, 41, 42, 44, 45, 1003},
                {99, 100, 103, 106, 128, 1004}
        };
        int target = 103;
        var result = SearchInSortedMatrix.searchInSortedMatrix(matrix, target);
        //System.out.println(String.format("%d %d", result[0], result[1]));
        assertEquals(matrix[result[0]][result[1]], target);
    }

}