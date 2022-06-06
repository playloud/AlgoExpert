package com.psh.leetcode;

import org.junit.Test;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimitTest {

    @Test
    public void test01() {
        var app = new LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit();
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        var result = app.longestSubarray_notSure(nums, limit);
        System.out.println(result);

    }

    @Test
    public void test02() {
        var app = new LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit();
        int[] nums = {10,1,2,4,7,2};
        int limit = 5;
        var result = app.longestSubarray(nums, limit);
        System.out.println(result);

    }

}