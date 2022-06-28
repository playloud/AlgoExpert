package com.psh.leetcode.ms.codility;

import org.junit.Test;

public class CodilityTestTest {

    @Test
    public void test01() {
        var app = new CodilityTest();
        int[] input = {1, 3, 6, 4, 1, 2};
        var result = app.solution_demo(input);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new CodilityTest();
        int[] input = {-12,3};
        var result = app.solution_demo(input);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var app = new CodilityTest();
        int[] input = {-1, -4, 4, 6};
        var result = app.solution_demo(input);
        System.out.println(result);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void test04() {
        var app = new CodilityTest();
        System.out.println(Integer.MAX_VALUE);
        var result = app.solution(1147483999);
        System.out.println(result);

    }

    @Test
    public void test05() {
        var app = new CodilityTest();
        var result = app.solution(147483647);
        System.out.println(result);
    }

    @Test
    public void test06() {
        var app = new CodilityTest();
        var result = app.solution(1234);
        System.out.println(result);
    }

    @Test
    public void test07() {
        var app = new CodilityTest();
        var result = app.solution(1234);
        System.out.println(result);
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void test08() {
        var app = new CodilityTest();

    }

}