package com.psh.leetcode.amazon.important;

import org.junit.Test;

public class SumofSubarrayMinimumsTest {

    @Test
    public void test01() {
        int[] arr = {3, 1, 2, 4};
        var app = new SumofSubarrayMinimums();
        var result = app.sumSubarrayMins_timeLimit(arr);
        System.out.println(result);
    }

    @Test
    public void test02() {
        int[] arr = {11, 81, 94, 43, 3};
        var app = new SumofSubarrayMinimums();
        var result = app.sumSubarrayMins_timeLimit(arr);
        System.out.println(result);
    }

    @Test
    public void test03() {
        int[] arr = {};
        var app = new SumofSubarrayMinimums();
        var result = app.sumSubarrayMins_timeLimit(arr);
        System.out.println(result);
    }

}