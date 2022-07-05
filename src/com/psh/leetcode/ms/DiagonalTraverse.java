package com.psh.leetcode.ms;

import java.util.*;

public class DiagonalTraverse {
    enum Direction {Up, Dn}
    public int[] findDiagonalOrder(int[][] mat) {
        Direction dir = Direction.Up;
        int i = 0, j = 0;
        int[] result = new int[mat.length * mat[0].length];
        int r = 0;

        while (r < result.length) {
            result[r] = mat[i][j];
            if (!isCanGo(i, j, dir, mat)) {
                if (dir == Direction.Dn) {
                    dir = Direction.Up;
                    if (j == 0 && i < mat.length-1 ) i++;
                    else if (j == 0 && i == mat.length-1) j++;
                    else j++;
                } else if (dir == Direction.Up) {
                    dir = Direction.Dn;
                    if (i == 0 && j < mat[0].length-1) j++;
                    else if (i == 0 && j == mat[0].length-1) i++;
                    else i++;
                }
            } else {
                if (dir == Direction.Up) {
                    --i;
                    ++j;
                } else if (dir == Direction.Dn) {
                    ++i;
                    --j;
                }
            }
            r++;
        }


        return result;
    }

    public boolean isCanGo(int i, int j, Direction dir, int[][] mat) {
        if (dir == Direction.Dn) {
            if (j == 0 || i == mat.length - 1) return false;
        } else if (dir == Direction.Up) {
            if (i == 0 || j == mat[0].length - 1) return false;
        }
        return true;
    }


}
