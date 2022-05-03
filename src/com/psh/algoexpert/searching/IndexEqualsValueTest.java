package com.psh.algoexpert.searching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IndexEqualsValueTest {

    @Test
    public void testIndexEqualValue() {
        int[] arr = {-5, -3, 0, 3, 4, 5, 9};
        var app = new IndexEqualsValue();
        System.out.println(app.indexEqualsValue(arr));
    }

    @Test
    public void testIndexEqualValue2() {
        int[] arr = {-12, 1, 2, 3, 12};
        var app = new IndexEqualsValue();
        System.out.println(app.indexEqualsValue(arr));
    }

    @Test
    public void testIndexEqualValue3() {
        int[] arr = {};
        var app = new IndexEqualsValue();
        System.out.println(app.indexEqualsValue(arr));
    }

}