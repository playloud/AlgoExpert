//https://www.algoexpert.io/questions/River%20Sizes
// PSH 01/25/22 : passed,
package com.psh.algoexpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    static int OCC = -1;

    public static List<Integer> riverSizes(int[][] matrix) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > 0) {
                    int size = getSize(i,j,matrix);
                    if(size > 0) {
                        result.add(size);
                    }
                }
            }
        }

        return result;
    }

    public static int getSize(int i, int j, int[][] mat) {
        if(i < 0 || j < 0 || i>=mat.length || j>=mat[i].length) {
            return 0;
        } else if (mat[i][j] == 0 || mat[i][j] == OCC) {
            return 0;
        } else {
            mat[i][j] = OCC;
            int size = 1 + getSize(i, j-1, mat) + getSize(i, j+1, mat) + getSize(i-1, j, mat) + getSize(i+1, j, mat);
            return size;
        }
    }
}
