package com.psh.algoexpert.famous;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TopologicalSortTest {
    @Test
    public void testTopologicalSort() {
        var jobs = Arrays.asList(1, 2, 3, 4);
        List<Integer[]> deps = new ArrayList<Integer[]>();
        deps.add(new Integer[]{1,2});
        deps.add(new Integer[]{1,3});
        deps.add(new Integer[]{3,2});
        deps.add(new Integer[]{4,2});
        deps.add(new Integer[]{4,3});

        var result = TopologicalSort.topologicalSort(jobs, deps);
        System.out.println(result);
    }

    @Test
    public void testTopologicalSort2() {
        var jobs = Arrays.asList(1, 2, 3, 4);
        List<Integer[]> deps = new ArrayList<Integer[]>();
        deps.add(new Integer[]{1,2});
        deps.add(new Integer[]{3,2});
        deps.add(new Integer[]{4,3});
        deps.add(new Integer[]{2,4});

        var result = TopologicalSort.topologicalSort(jobs, deps);
        System.out.println(result);
    }

    @Test
    public void testTopologicalSort3() {
        var jobs = Arrays.asList(1, 2, 3, 4);
        List<Integer[]> deps = new ArrayList<Integer[]>();
//        deps.add(new Integer[]{1,2});
//        deps.add(new Integer[]{3,2});
//        deps.add(new Integer[]{4,3});
//        deps.add(new Integer[]{2,4});

        var result = TopologicalSort.topologicalSort(jobs, deps);
        System.out.println(result);
    }

}