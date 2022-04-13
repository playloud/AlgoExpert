package com.psh.algoexpert.stacks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortStackTest {
    @Test
    public void testSortStack() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(3,2,4,6,5,-1));
        var app = new SortStack();
        var result = app.sortStack(arr);
        System.out.println(result);
    }

    @Test
    public void testSortStack2() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(3,-1, 2, -234));
        var app = new SortStack();
        var result = app.sortStack(arr);
        System.out.println(result);
    }

    @Test
    public void testSortStack3() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList());
        var app = new SortStack();
        var result = app.sortStack(arr);
        System.out.println(result);
    }

}