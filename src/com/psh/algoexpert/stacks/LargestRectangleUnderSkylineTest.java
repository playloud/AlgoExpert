package com.psh.algoexpert.stacks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestRectangleUnderSkylineTest {

    @Test
    public void testLargestRect() {
        var input = new ArrayList<Integer>();
        input.addAll(Arrays.asList(1, 3, 3, 2, 4, 1, 5, 3, 2));
        var app = new LargestRectangleUnderSkyline();
        var result = app.largestRectangleUnderSkyline(input);
        System.out.println(result);
    }

}