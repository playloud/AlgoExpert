package com.psh.algoexpert.stacks;
import java.util.*;
public class LargestRectangleUnderSkyline {
    public int largestRectangleUnderSkyline_bruteForse(ArrayList<Integer> buildings) {
        if(buildings.size() == 0) return 0;
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < buildings.size(); i++) {
            for (int j = i; j < buildings.size(); j++) {
                int width = (j-i+1);
                // height = min (i to j)
                int minHeight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    minHeight = Math.min(minHeight, buildings.get(k));
                }
                int area = minHeight * width;
                if(area  > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int largestRectangleUnderSkyline(ArrayList<Integer> buildings) {
        if(buildings.size() == 0) return 0;
        int maxArea = Integer.MIN_VALUE;

        return maxArea;
    }
}
