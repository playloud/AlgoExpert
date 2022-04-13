package com.psh.algoexpert.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SolveSudokuTest {

    @Test
    public void testSudoku() {
        var root = new ArrayList<ArrayList<Integer>>();
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.get(0).addAll(Arrays.asList(7, 8, 0, 4, 0, 0, 1, 2, 0));
        root.get(1).addAll(Arrays.asList(6, 0, 0, 0, 7, 5, 0, 0, 9));
        root.get(2).addAll(Arrays.asList(0, 0, 0, 6, 0, 1, 0, 7, 8));
        root.get(3).addAll(Arrays.asList(0, 0, 7, 0, 4, 0, 2, 6, 0));
        root.get(4).addAll(Arrays.asList(0, 0, 1, 0, 5, 0, 9, 3, 0));
        root.get(5).addAll(Arrays.asList(9, 0, 4, 0, 6, 0, 0, 0, 5));
        root.get(6).addAll(Arrays.asList(0, 7, 0, 3, 0, 0, 0, 1, 2));
        root.get(7).addAll(Arrays.asList(1, 2, 0, 0, 0, 7, 4, 0, 0));
        root.get(8).addAll(Arrays.asList(0, 4, 9, 2, 0, 6, 0, 0, 7));

        var app = new SolveSudoku();
        app.solveSudoku(root);
    }

    @Test
    public void testSudoku4() {
        var root = new ArrayList<ArrayList<Integer>>();
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.add(new ArrayList<>());
        root.get(0).addAll(Arrays.asList(0, 2, 0, 0, 9, 0, 1, 0, 0));
        root.get(1).addAll(Arrays.asList(0, 0, 7, 8, 0, 0, 0, 0, 0));
        root.get(2).addAll(Arrays.asList(0, 0, 0, 0, 0, 0, 3, 6, 0));
        root.get(3).addAll(Arrays.asList(0, 0, 1, 9, 0, 4, 0, 0, 0));
        root.get(4).addAll(Arrays.asList(0, 0, 0, 6, 0, 5, 0, 0, 7));
        root.get(5).addAll(Arrays.asList(8, 0, 0, 0, 0, 0, 0, 0, 9));
        root.get(6).addAll(Arrays.asList(0, 0, 0, 0, 2, 0, 0, 0, 0));
        root.get(7).addAll(Arrays.asList(7, 0, 0, 0, 0, 0, 0, 8, 5));
        root.get(8).addAll(Arrays.asList(4, 9, 0, 0, 3, 0, 0, 0, 0));

        var app = new SolveSudoku();
        var result = app.solveSudoku(root);
        System.out.println(result);
    }

    @Test
    public void testArr() {
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;

        modifyArr(arr);

        System.out.println(Arrays.toString(arr));
    }

    public void modifyArr(int[] arr) {
        arr[0] = 123;
    }

}