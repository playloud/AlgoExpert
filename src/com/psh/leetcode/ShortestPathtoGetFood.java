package com.psh.leetcode;

import java.util.*;

public class ShortestPathtoGetFood {
    int result = -1;
    public int getFood(char[][] grid) {

        int sx = 0, sy = 0;
        // * to #, X blocking, O opened
        outer: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '*'){
                    sx = i;sy = j;
                }
            }
        }

        var q = new ArrayDeque<int[]>();
        int[][] dir = new int[][]{
                {-1, 0}, {1, 0}, {0, 1},{0, -1}
        };

        q.add(new int[]{sx, sy});

        while(q.size() > 0) {
            result++;
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                var cur = q.remove();
                if(grid[cur[0]][cur[1]] == '#'){
                    return result;
                }
                //System.out.println(String.format("%d, %d", cur[0], cur[1]));
                int nx, ny;

                for (int[] nd : dir) {
                    nx = nd[0] + cur[0];
                    ny = nd[1] + cur[1];

                    if(isValid(grid, nx, ny)) {
                        if(grid[nx][ny] == 'O')
                            grid[nx][ny] = 'X';
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1;
    }

    public boolean isValid(char[][] grid, int x, int y) {
        if (x < 0 || grid.length <= x) return false;
        if (y < 0 || grid[x].length <= y) return false;
        if (grid[x][y] == 'O' || grid[x][y] == '#') return true;
        return false;
    }












    public int getFood_timeLimit(char[][] grid) {
        result = Integer.MAX_VALUE;
        int countOfTarget = 0;
        int sx = 0, sy = 0;
        // * to #, X blocking, O opened
        outer: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '*'){
                    sx = i;sy = j;
                }

                if(grid[i][j] == '#'){
                    countOfTarget++;
                }
            }
        }

        if(countOfTarget == 0) return -1;

        var hist = new HashMap<Integer, HashSet<Integer>>();
        hist.put(sx, new HashSet<>());
        hist.get(sx).add(sy);
        search(sx, sy, hist, grid);
        if (result == Integer.MAX_VALUE)
            return -1;
        return (result-1);
    }

    public void search(int x, int y, HashMap<Integer, HashSet<Integer>> hist, char[][] grid) {
        if(result < getTotalSize(hist) -1)
            return;

        //System.out.println(String.format("[%d %d]", x, y));
        if (grid[x][y] == '#') {
            //System.out.println("found");
            //found one
            int totalSteps = 0;
            for (Integer k : hist.keySet()) {
                totalSteps += hist.get(k).size();
            }
            result = Math.min(result, totalSteps);
            return;
        }

        int nx = 0, ny = 0;

        // up
        nx = x - 1;
        ny = y;
        if (isValid(grid, nx, ny)) {
            if (!hist.containsKey(nx)) hist.put(nx, new HashSet<>());
            if(!hist.get(nx).contains(ny)){
                hist.get(nx).add(ny);
                search(nx, ny, hist, grid);
                hist.get(nx).remove(ny);
            }
        }
        // down
        nx = x + 1;
        ny = y;
        if (isValid(grid, nx, ny)) {
            if (!hist.containsKey(nx)) hist.put(nx, new HashSet<>());
            if(!hist.get(nx).contains(ny)){
                hist.get(nx).add(ny);
                search(nx, ny, hist, grid);
                hist.get(nx).remove(ny);
            }
        }
        // left
        nx = x;
        ny = y - 1;
        if (isValid(grid, nx, ny)) {
            if (!hist.containsKey(nx)) hist.put(nx, new HashSet<>());
            if(!hist.get(nx).contains(ny)){
                hist.get(nx).add(ny);
                search(nx, ny, hist, grid);
                hist.get(nx).remove(ny);
            }
        }
        // right
        nx = x;
        ny = y + 1;
        if (isValid(grid, nx, ny)) {
            if (!hist.containsKey(nx)) hist.put(nx, new HashSet<>());
            if(!hist.get(nx).contains(ny)){
                hist.get(nx).add(ny);
                search(nx, ny, hist, grid);
                hist.get(nx).remove(ny);
            }
        }
    }

    int count = 0;
    public int getTotalSize(HashMap<Integer, HashSet<Integer>> hist) {
        count = 0;
        for (Integer k : hist.keySet()) {
            count += hist.get(k).size();
        }
        return count;
    }


}
