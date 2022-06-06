package com.psh.leetcode.amazon;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthofSubarrayWithPositiveProductTest {
    @Test
    public void test01() {
        var app = new MaximumLengthofSubarrayWithPositiveProduct();
        int[] nums = {1,-2,-3,4};
        var result = app.getMaxLen(nums);
        System.out.println(result);

    }

    @Test
    public void test02() {
        var app = new MaximumLengthofSubarrayWithPositiveProduct();
        int[] nums = {0,1,-2,-3,-4};
        var result = app.getMaxLen(nums);
        System.out.println(result);

    }

    @Test
    public void test03() {
        var app = new MaximumLengthofSubarrayWithPositiveProduct();
        int[] nums = {-1,-2,-3,0,1};
        var result = app.getMaxLen(nums);
        System.out.println(result);

    }

    @Test
    public void test04() {
        var app = new MaximumLengthofSubarrayWithPositiveProduct();
        int[] nums = {0, 1, -1, 1, 0, 1,1,1,1,0};
        var result = app.getMaxLen(nums);
        System.out.println(result);

    }
    @Test
    public void test05() {
        var app = new MaximumLengthofSubarrayWithPositiveProduct();
        int[] nums = {0};
        var result = app.getMaxLen(nums);
        System.out.println(result);

    }

}