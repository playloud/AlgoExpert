package com.psh.leetcode.amazon;
//https://leetcode.com/problems/design-tic-tac-toe/
// my solution is .. optimized bruteforce
public class TicTacToe {
    int[][] grid = null;
    public TicTacToe(int n) {
        this.grid = new int[n][n];
    }
    public int move(int row, int col, int player) {
        grid[col][row] = player;
        return checkGrid(grid);
    }
    public int checkGrid(int[][] grid) {
        boolean diffFound = false;
        int prev = -1;
        // horizontally
        for (int i = 0; i < grid.length; i++) {
            prev = -1;
            diffFound = false;
            for (int j = 0; j < grid[i].length; j++) {
                // check
                if (j == 0)
                    prev = grid[i][j];
                else {
                    if (prev != grid[i][j]) {
                        diffFound = true;
                        break;
                    }
                }
                prev = grid[i][j];
            }
            if (!diffFound && prev != 0) return prev; // found one
        }
        // vertically
        for (int i = 0; i < grid.length; i++) {
            prev = -1;
            diffFound = false;
            for (int j = 0; j < grid[i].length; j++) {
                // check
                if (j == 0)
                    prev = grid[j][i];
                else {
                    if (prev != grid[j][i]) {
                        diffFound = true;
                        break;
                    }
                }
                prev = grid[j][i];
            }
            if (!diffFound && prev != 0) return prev; // found one
        }
        //diagnostically 1
        prev = -1;
        for (int i = 0; i < grid.length; i++) {
            diffFound = false;
            // check
            if (i == 0)
                prev = grid[i][i];
            else {
                if (prev != grid[i][i]) {
                    diffFound = true;
                    break;
                }
            }
            prev = grid[i][i];
        }
        if (!diffFound && prev != 0)
            return prev; // found one
        //diagnostically 2
        prev = -1;
        for (int i = 0; i < grid.length; i++) {
            diffFound = false;
            // check
            if (i == 0)
                prev = grid[grid.length - 1 - i][i];
            else {
                if (prev != grid[grid.length - 1 - i][i]) {
                    diffFound = true;
                    break;
                }
            }
            prev = grid[grid.length - 1 - i][i];
        }
        if (!diffFound && prev != 0)
            return prev; // found one
        return 0;
    }
}