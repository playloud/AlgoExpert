package com.psh.algoexpert.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoEdgeConnectedGraphTest {

    @Test
    public void testTwoEdngeConns() {
        int[][] edges = {
                {1, 2, 5},
                {0, 2},
                {0, 1, 3},
                {2, 4, 5},
                {3, 5},
                {0, 3, 4}
        };
        var app = new TwoEdgeConnectedGraph();
        var result = app.twoEdgeConnectedGraph(edges);
        System.out.println(result);

    }

    @Test
    public void testTwoEdngeConns2() {
        int[][] edges = {
                {1},
                {0, 2, 3},
                {1, 3},
                {1, 2}
        };
        var app = new TwoEdgeConnectedGraph();
        var result = app.twoEdgeConnectedGraph(edges);
        System.out.println(result);

    }

    @Test
    public void testTwoEdngeConns3() {
        int[][] edges = {
                {1, 2, 3},
                {0, 2},
                {0, 1},
                {0, 4, 5},
                {3, 5},
                {3, 4}
        };
        var app = new TwoEdgeConnectedGraph();
        var result = app.twoEdgeConnectedGraph(edges);
        System.out.println(result);

    }

}