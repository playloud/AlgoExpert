package com.psh.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GroupShiftedStringsTest {

    @Test
    public void test01() {
        var app = new GroupShiftedStrings();
        String[] input = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        var result = app.groupStrings(input);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new GroupShiftedStrings();
        String[] input = {"a"};
        var result = app.groupStrings(input);
        System.out.println(result);
    }

    @Test
    public void t() {
        System.out.println(('z' - 'a'));
        System.out.println(('a' - 'b'));
        System.out.println(('a' - 'z'));
        System.out.println(('z' - 'a'));
    }

}