package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class CycleInGraphTest {

    @Test
    public void testCycleInG() {
        int[][] edges = {
                {1, 3},
                {2, 3, 4},
                {0},
                {},
                {2, 5},
                {}
        };

        var app = new CycleInGraph();
        var result = app.cycleInGraph(edges);
        System.out.println(result);
    }

    @Test
    public void testCycleInG2() {
        int[][] edges = {
                {1, 2},
                {2},
                {}
        };

        var app = new CycleInGraph();
        var result = app.cycleInGraph(edges);
        System.out.println(result);
    }

}