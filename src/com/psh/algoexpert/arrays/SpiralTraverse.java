package com.psh.algoexpert.arrays;

import java.util.*;

public class SpiralTraverse {

    static int i,j;
    public static List<Integer> spiralTraverse(int[][] array) {
        i = j = 0;
        var result = new ArrayList<Integer>();
        int totalSize = array.length * array[0].length;
        var trails = new HashSet<String>();
        int direction = 0;
        while(result.size() < totalSize) {
            switch (direction) {
                case 0:
                    doRight(array, result, trails);
                    break;
                case 1:
                    doDown(array, result, trails);
                    break;
                case 2:
                    doLeft(array, result, trails);
                    break;
                case 3:
                    doUp(array, result, trails);
                    break;
            }
            direction++;
            direction = direction%4;
        }

        // Write your code here.
        return result;
    }

    private static void doRight(int[][] mat, ArrayList<Integer> result, HashSet<String> trails) {
        while(true) {
            result.add(mat[i][j]);
            String curKey = String.format("%d_%d", i,j);
            trails.add(curKey);
            String nextKey = String.format("%d_%d", i,j+1);
            if(trails.contains(nextKey) || ( j+1 >= mat[i].length))
                break;
            else
                j++;
        }
        //move to down
        String nextKey = String.format("%d_%d", i+1,j);
        if(!trails.contains(nextKey))
            i++;

    }

    private static void doLeft(int[][] mat, ArrayList<Integer> result, HashSet<String> trails) {
        while(true) {
            result.add(mat[i][j]);
            String curKey = String.format("%d_%d", i,j);
            trails.add(curKey);
            String nextKey = String.format("%d_%d", i,j-1);
            if(trails.contains(nextKey) || ( j-1 < 0))
                break;
            else
                j--;
        }
        //move to up
        String nextKey = String.format("%d_%d", i-1,j);
        if(!trails.contains(nextKey))
            i--;
    }










    private static void doDown(int[][] mat, ArrayList<Integer> result, HashSet<String> trails) {
        while(true) {
            result.add(mat[i][j]);
            String curKey = String.format("%d_%d", i,j);
            trails.add(curKey);
            String nextKey = String.format("%d_%d", i+1,j);
            if(trails.contains(nextKey) || ( i+1 >= mat.length))
                break;
            else
                i++;
        }
        String nextKey = String.format("%d_%d", i,j-1);
        if(!trails.contains(nextKey))
            j--;
    }

    private static void doUp(int[][] mat, ArrayList<Integer> result, HashSet<String> trails) {
        while(true) {
            result.add(mat[i][j]);
            String curKey = String.format("%d_%d", i,j);
            trails.add(curKey);
            String nextKey = String.format("%d_%d", i-1,j);
            if(trails.contains(nextKey) || ( i-1 <0))
                break;
            else
                i--;
        }
        String nextKey = String.format("%d_%d", i,j+1);
        if(!trails.contains(nextKey))
            j++;
    }

}
