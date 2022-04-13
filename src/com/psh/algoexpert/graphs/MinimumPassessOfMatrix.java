package com.psh.algoexpert.graphs;

import java.util.*;

public class MinimumPassessOfMatrix {

    public int minimumPassesOfMatrix( int[][] matrix) {

        // count of not zero
        int total = 0;
        var plusQ = new ArrayDeque<Point>();
        var step = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != 0) total++;
                if(matrix[i][j] > 0) {
                    plusQ.add(new Point(i,j));
                }
            }
        }
        while(plusQ.size() > 0) {
            var newQ = new ArrayDeque<Point>();
            while(plusQ.size() > 0) {
                var p = plusQ.remove();
                //up
                if(p.x-1 >= 0) {
                    if(matrix[p.x-1][p.y] < 0){
                        matrix[p.x-1][p.y] = Math.abs(matrix[p.x-1][p.y]);
                        newQ.add(new Point(p.x-1, p.y));
                    }
                }
                //down
                if(p.x+1 < matrix.length) {
                    if(matrix[p.x+1][p.y] < 0){
                        matrix[p.x+1][p.y] = Math.abs(matrix[p.x][p.y]);
                        newQ.add(new Point(p.x+1, p.y));
                    }
                }
                //left
                if(p.y-1 >= 0) {
                    if(matrix[p.x][p.y-1] < 0){
                        matrix[p.x][p.y-1] = Math.abs(matrix[p.x][p.y-1]);
                        newQ.add(new Point(p.x, p.y-1));
                    }
                }
                //right
                if(p.y+1 < matrix[p.x].length) {
                    if(matrix[p.x][p.y+1] < 0){
                        matrix[p.x][p.y+1] = Math.abs(matrix[p.x][p.y+1]);
                        newQ.add(new Point(p.x, p.y+1));
                    }
                }
            }
            if(newQ.size() > 0) step++;
            plusQ = newQ;
        }

        // check there is minus again
        // if still minus - simply return -1
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0) {
                    return -1;
                }
            }
        }

        return step;
    }

    public class Point {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int x = 0;
        int y = 0;
    }
}
