package com.psh.algoexpert.graphs;

import com.psh.algoexpert.Util;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveIslandsTest {

    @Test
    public void testRemoveIsland() {
        int[][] input = {
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 0},
                {1, 0, 0, 0, 0, 1}
        };
        var app = new RemoveIslands();
        var result = app.removeIslands(input);
        Util.print2D(result);

    }

}