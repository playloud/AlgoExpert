package com.psh.algoexpert.heaps;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortedArraysTest {

    @Test
    public void test01() {
        var app = new MergeSortedArrays();
        var arrays = new ArrayList<List<Integer>>();
        arrays.add(new LinkedList<Integer>(Arrays.asList(1,2,3,4)));
        arrays.add(new LinkedList<Integer>(Arrays.asList(-1,0,3,4)));
        arrays.add(new LinkedList<Integer>(Arrays.asList(-11,22,33,41)));
        var result = MergeSortedArrays.mergeSortedArrays(arrays);
        System.out.println(result);
    }

    @Test
    public void test03() {
        var list = Arrays.asList(1,2,3,4);
        var ll = new LinkedList<Integer>(list);
        ll.remove(0);
        System.out.println(ll);

    }




}