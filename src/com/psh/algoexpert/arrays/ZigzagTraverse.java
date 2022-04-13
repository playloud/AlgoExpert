package com.psh.algoexpert.arrays;
import java.util.*;
public class ZigzagTraverse {
    enum DIRECTION {Left,Right};
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {

        // making array by indice
        int[][] arr = new int[array.size()][];
        for (int i = 0; i < array.size(); i++) {
            var sub = array.get(i);
            arr[i] = new int[sub.size()];
            for (int j = 0; j < sub.size(); j++) {
                arr[i][j] = sub.get(j);
            }
        }

        var result = new ArrayList<Integer>();
        DIRECTION dir = DIRECTION.Left;
        int totalCount = (arr.length) * (arr[0].length);
        int count = 0;
        int i, j;
        i=j=0;
        while(count < totalCount) {
            count++;
            int value = arr[i][j];
            result.add(value);

            if(i==arr.length-1 && dir == DIRECTION.Left) {
                dir = DIRECTION.Right;
                j++;
            } else if(j==0 && dir == DIRECTION.Left) {
                dir = DIRECTION.Right;
                i++;
            }
            else if(j == arr[0].length-1 && dir == DIRECTION.Right) {
                dir = DIRECTION.Left;
                i++;
            }
            else if(i==0 && dir == DIRECTION.Right) {
                dir = DIRECTION.Left;
                j++;
            }

            else {
                if(dir == DIRECTION.Right) {
                    i--;
                    j++;
                } else if(dir == DIRECTION.Left) {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }
}
