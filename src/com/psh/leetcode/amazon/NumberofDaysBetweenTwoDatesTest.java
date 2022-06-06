package com.psh.leetcode.amazon;

import org.junit.Test;

public class NumberofDaysBetweenTwoDatesTest {

    @Test
    public void test01() {
        var app = new NumberofDaysBetweenTwoDates();
        var result = app.daysBetweenDates("2020-12-21", "2021-1-1");
        System.out.println(result);

    }

}