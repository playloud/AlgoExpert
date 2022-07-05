package com.psh.leetcode.ms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DiagonalTraverseTest {

    @Test
    public void test01() {
        int[][] input = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };

        var app = new DiagonalTraverse();
        var result = app.findDiagonalOrder(input);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void test02() {
        int[][] input = {
                {1, 2}, {3, 4}
        };

        var app = new DiagonalTraverse();
        var result = app.findDiagonalOrder(input);
        System.out.println(Arrays.toString(result));
    }

}