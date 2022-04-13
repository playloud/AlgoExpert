package com.psh.algoexpert.dp;
import java.util.*;
public class WaterArea {
    public static int waterArea(int[] heights) {
        int totalArea = 0;
        int cp = -1;
        int maxValue = Integer.MIN_VALUE;
        // find biggest value
        for (int i = 0; i < heights.length; i++) {
            if(maxValue < heights[i]) {
                maxValue = heights[i];
                cp = i;
            }
        }

        //from cp, go right
        int cpR = cp;
        int maxR = 0;
        while(cpR < heights.length) {
            maxR = Integer.MIN_VALUE;
            int nextIndex = -1;
            // find next biggest height
            for (int i = cpR+1; i < heights.length; i++) {
                if(maxR < heights[i]) {
                    maxR = heights[i];
                    nextIndex = i;
                }
            }

            if(nextIndex == -1)
                break;

            // calculate area
            int area = (nextIndex - cpR -1) * (Math.min(heights[cpR], heights[nextIndex]));

            // delete middle values
            int tempArea = 0;
            for (int i = cpR+1; i < nextIndex; i++) {
                tempArea += heights[i];
            }
            area = area - tempArea;
            totalArea += area;
            cpR = nextIndex;
        }

        //from cp, go left
        int cpL = cp;
        int maxL = 0;
        while(cpL >= 0) {
            maxL = Integer.MIN_VALUE;
            int nextIndex = -1;
            // find next biggest height
            for (int i = cpL-1; i >= 0; i--) {
                if(maxL < heights[i]) {
                    maxL = heights[i];
                    nextIndex = i;
                }
            }

            if(nextIndex == -1)
                break;

            // calculate area
            int area = (cpL - nextIndex -1) * (Math.min(heights[cpL], heights[nextIndex]));

            // delete middle values
            int tempArea = 0;
            for (int i = cpL-1; i > nextIndex; i--) {
                tempArea += heights[i];
            }
            area = area - tempArea;
            totalArea += area;
            cpL = nextIndex;
        }
        return totalArea;
    }
}