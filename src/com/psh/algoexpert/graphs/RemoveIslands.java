package com.psh.algoexpert.graphs;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveIslands {

    public int[][] removeIslands( int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==0 || j==0) continue;
                var island = new Island();
                if(matrix[i][j] == 1) {
                    getIsland(matrix, island, i, j);
                }
                if(island.isValid){
                    for (Point p : island.points) {
                        matrix[p.i][p.j] = 0;
                    }
                }
            }
        }
        return matrix;
    }

    public void getIsland(int[][] mat, Island island, int i, int j) {
        // those are keypoints
        if(i >= 0 && j >= 0 && i < mat.length && j < mat[i].length && mat[i][j] == 1 ) {
            if(i == 0 || j==0 || i == mat.length-1 || j == mat[i].length-1) {
                island.isValid = false;
            } else {
                if(island.addPoint(i,j)) {
                    getIsland(mat, island, i+1,j);
                    getIsland(mat, island, i,j+1);
                    getIsland(mat, island, i-1,j);
                    getIsland(mat, island, i,j-1);
                }
            }
        }
    }

    class Island {
        public HashSet<String> signatures = new HashSet<>();
        public HashSet<Point> points = new HashSet<>();
        public boolean isValid = true;

        public boolean addPoint(int i, int j) {
            if(contains(i, j))
                return false;
            points.add(new Point(i, j));
            signatures.add(String.format("%d_%d", i, j));
            return true;
        }

        private boolean contains(int i, int j) {
            if(signatures.contains(String.format("%d_%d", i, j))) return true;
            return false;
        }
    }

    class Point {
        int i = 0;
        int j = 0;
        String signature = null;
        public Point(int i, int j) {
            this.i = i;
            this.j = j;
            this.signature = String.format("%d_%d", i, j);
        }
    }

}
