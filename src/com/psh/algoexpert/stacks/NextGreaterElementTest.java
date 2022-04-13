package com.psh.algoexpert.stacks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextGreaterElementTest {

    @Test
    public void testNextGreat() {
        int[] input = {2, 5, -3, -4, 6, 7, 2};
        var app = new NextGreaterElement();
        var result = app.nextGreaterElement(input);
        System.out.println(Arrays.toString(result));
    }

}