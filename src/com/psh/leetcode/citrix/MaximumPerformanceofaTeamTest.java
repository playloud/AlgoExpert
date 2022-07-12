package com.psh.leetcode.citrix;

import org.junit.Test;

public class MaximumPerformanceofaTeamTest {
    @Test
    public void test01() {
        var app = new MaximumPerformanceofaTeam();
        int n = 6;
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] effi = {5, 4, 3, 9, 7, 2};
        int k = 2;
        var result = app.maxPerformance_wrong(n, speed, effi, k);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new MaximumPerformanceofaTeam();
        int n = 6;
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] effi = {5, 4, 3, 9, 7, 2};
        int k = 2;
        var result = app.maxPerformance(n, speed, effi, k);
        System.out.println(result);
    }

}