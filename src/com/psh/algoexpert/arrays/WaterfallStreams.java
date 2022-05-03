package com.psh.algoexpert.arrays;
import com.psh.algoexpert.Util;

import java.util.*;
public class WaterfallStreams {
    public double[] waterfallStreams(double[][] array, int source) {

        double[][] target = new double[array.length][];
        for (int i = 0; i < array.length; i++) {
            target[i] = new double[array[i].length];
        }

        for (int i = 0; i < array.length; i++) {
            double[] prev = null;
            double[] cur = null;
            double[] next = null;

            if(i>0)
                prev = array[i-1];
            cur = array[i];
            if(i<array.length-1)
                next = array[i+1];

            if(prev == null) {
                cur[source] = 100;
                if(next[source] == 1) {
                    //do split
                    //left
                    int temp = source-1;
                    while(true) {
                        if(temp < 0) break;
                        if(cur[temp] == 1) break;
                        cur[temp] = cur[source]/2 + cur[temp];
                        if(next[temp] == 0) break;
                        temp--;
                    }

                    //right
                    temp = source+1;
                    while(true) {
                        if(temp >= cur.length ) break;
                        if(cur[temp] == 1) break;
                        cur[temp] = cur[source]/2 + cur[temp];
                        if(next[temp] == 0) break;
                        temp++;
                    }
                }
            } else if(next == null) {
                // last line
                for (int j = 0; j < cur.length; j++) {
                    if(prev[j] > 1) {
                        // transfer and split
                        if(cur[j] == 0)
                            cur[j] = prev[j];
                    }
                }
            } else {
                // normal cases
                for (int j = 0; j < cur.length; j++) {
                    if(prev[j] > 1) {
                        // transfer and split
                        if(cur[j] !=1) {
                            cur[j] = prev[j] + cur[j] ;
                            if(next[j] == 1) {
                                //left
                                int temp = j-1;
                                while(true) {
                                    if(temp < 0) break;
                                    if(cur[temp] == 1) break;
                                    cur[temp] = cur[j]/2 + cur[temp];
                                    if(next[temp] == 0) break;
                                    temp--;
                                }

                                //right
                                temp = j+1;
                                while(true) {
                                    if(temp >= cur.length ) break;
                                    if(cur[temp] == 1) break;
                                    cur[temp] = cur[j]/2 + cur[temp];
                                    if(next[temp] == 0) break;
                                    temp++;
                                }
                            }
                        }

                    }
                }
            }

            Util.print2D(array, 10);
            System.out.println();


        }
        double[] result = new double[array[0].length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[array.length-1][i];
        }
        // Write your code here.
        return result;
    }




    public void fillUp(int i, int j, double size, boolean isBound, double[][] srcArray, double[][] target) {
        if(i>=srcArray.length) return;
        if(j>=srcArray[0].length) return;
        target[i][j] = size + target[i][j];

        if(i+1 >= srcArray.length) return;
        if(srcArray[i+1][j] == 1 && isBound) {
            //split
            // going left
            int temp = j-1;
            while(true) {
                if(temp < 0) break;
                if(srcArray[i][temp] == 1) break;
                fillUp(i, temp, size/2, false, srcArray, target);
                temp--;
            }
            // going right
            temp = j+1;
            while(true) {
                if(temp >= srcArray[i].length) break;
                if(srcArray[i][temp] == 1) break;
                fillUp(i, temp, size/2, false, srcArray, target);
                temp++;
            }

        } else if(srcArray[i+1][j] == 0) {
            fillUp(i+1,j, size, true, srcArray, target);
        }

    }
}
