package com.psh.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BasicCalculatorIITest {

    @Test
    public void splitTest() {
        System.out.println(Arrays.toString("1+2+3".split("\\+")));
        System.out.println(Arrays.toString("1*2+3".split("\\*")));
        System.out.println(Arrays.toString("1*2/3".split("/")));
        System.out.println(Arrays.toString("1-2-3".split("-")));
    }

    @Test
    public void test01() {
        var app = new BasicCalculatorII();
        System.out.println(app.calculate("1+2+3"));
        //System.out.println(app.calculate("1+2*2+2+5-12+1+1"));
        System.out.println(app.calculate("1-7 + 6/1"));
        System.out.println(app.calculate("1+ 2*5/3 + 6/4*2"));
        System.out.println(app.calculate("123-8*5-57/3+148+1*3/2*14*11*2*5/4*3/3/3+2283"));
        // 1 + 3 + 2 = 6
        //
    }

}