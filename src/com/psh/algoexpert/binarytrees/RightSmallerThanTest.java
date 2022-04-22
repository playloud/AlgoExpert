package com.psh.algoexpert.binarytrees;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RightSmallerThanTest {

    @Test
    public void testRightSmallerThan() {
        var input = Arrays.asList(8, 5, 11, -1, 3, 4, 2);
        var result = RightSmallerThan.rightSmallerThan(input);
        System.out.println(result);
    }

    @Test
    public void testRightSmallerThan2() {
        var input = new ArrayList<Integer>();

        var result = RightSmallerThan.rightSmallerThan(input);
        System.out.println(result);
    }

    @Test
    public void testRightSmallerThan3() {
        var input = Arrays.asList(1);
        var result = RightSmallerThan.rightSmallerThan(input);
        System.out.println(result);
    }

    @Test
    public void testRightSmallerThan4() {
        var input = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13);
        var result = RightSmallerThan.rightSmallerThan(input);
        System.out.println(result);
    }

}