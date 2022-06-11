package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumofSubarrayRangesTest {

    @Test
    public void testhm() {

    }

    @Test
    public void test01() {
        var app = new SumofSubarrayRanges();
        int[] nums = {1,2,3};
        var result = app.subArrayRanges(nums);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new SumofSubarrayRanges();
        int[] nums = {1, 3, 3};
        var result = app.subArrayRanges(nums);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var app = new SumofSubarrayRanges();
        int[] nums = {4,-2,-3,4,1};
        var result = app.subArrayRanges(nums);
        System.out.println(result);
    }

}