package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MoveElementToEndTest {

    @Test
    public void testMoveElement() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(2,1,2,2,2,3,4,2));
        var result = MoveElementToEnd.moveElementToEnd(arr, 2);
        System.out.println(result);

    }

    @Test
    public void testMoveElement2() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(1,2,4,5,6));
        var result = MoveElementToEnd.moveElementToEnd(arr, 3);
        System.out.println(result);
    }


    @Test
    public void testMove() {
        var arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(0,1,2,3,4));
        System.out.println(arr);
        int indexTo = 1;
        arr.remove(indexTo);
        arr.add(indexTo, 123);
        System.out.println(arr);
    }

}