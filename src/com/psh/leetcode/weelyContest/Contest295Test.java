package com.psh.leetcode.weelyContest;

import org.junit.Test;

public class Contest295Test {
    //[10,1,2,3,4,5,6,1,2,3]
    @Test
    public void test03_01() {
        var app = new Contest295();
        int[] nums = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        var result = app.totalSteps_ref01(nums);
        System.out.println(result);
    }

    @Test
    public void test03_02() {
        var app = new Contest295();
        int[] nums = {4, 5, 7, 7, 13};
        var result = app.totalSteps_timeLimit2(nums);
        System.out.println(result);
    }

    @Test
    public void test03_03() {
        var app = new Contest295();
        int[] nums = {10, 1, 2, 3, 4, 5, 6, 1, 2, 3};
        var result = app.totalSteps_timeLimit2(nums);
        System.out.println(result);
    }

    @Test
    public void test03_04() {
        var app = new Contest295();
        int[] nums = {5, 1, 2, 3, 4, 10};
        var result = app.totalSteps_ref01(nums);
        System.out.println(result);
    }

    @Test
    public void test03_05() {
        var app = new Contest295();
        int[] nums = {8, 7, 6, 5, 9};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test03_06() {
        var app = new Contest295();
        int[] nums = {8, 7, 6, 5, 9, 2, 3, 4, 5, 14};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test03_07() {
        var app = new Contest295();
        int[] nums = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test03_08() {
        var app = new Contest295();
        int[] nums = {4, 5, 7, 7, 13};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test03_09() {
        var app = new Contest295();
        int[] nums = {10, 1, 2, 3, 4, 5, 6, 1, 2, 3};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test03_10() {
        var app = new Contest295();
        int[] nums = {10, 1, 2, 3};
        var result = app.totalSteps(nums);
        System.out.println(result);
    }

    @Test
    public void test02_01() {
        var app = new Contest295();
        System.out.println(app.getDiscounted("$10", 100));
        ;
    }

    @Test
    public void test02_02() {
        var app = new Contest295();
        String sent = "there are $1 $2 and 5$ candies in the shop";
        int disc = 50;
        var result = app.discountPrices(sent, disc);
        System.out.println(result);
    }

    @Test
    public void test02_03() {
        var app = new Contest295();
        String sent = "1 2 $3 4 $5 $6 7 8$ $9 $10$";
        int disc = 100;
        var result = app.discountPrices(sent, disc);
        System.out.println(result);
    }

    @Test
    public void test02_04() {
        var app = new Contest295();
        String sent = "706hzu76jjh7yufr5x9ot60v149k5 $7651913186 pw2o $6";
        int disc = 28;
        var result = app.discountPrices(sent, disc);
        System.out.println(result);
    }

    @Test
    public void testRearrange01() {
        var app = new Contest295();
        var result = app.rearrangeCharacters("abbaccaddaeea", "aaaaa");
        System.out.println(result);

    }

    @Test
    public void testRearrange02() {
        var app = new Contest295();
        var result = app.rearrangeCharacters("ilovecodingonleetcode", "code");
        System.out.println(result);

    }

    @Test
    public void testRearrange03() {
        var app = new Contest295();
        var result = app.rearrangeCharacters("abcbac", "abc");
        System.out.println(result);

    }

}