package com.psh.algoexpert.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MinimumAreaRectangle2 {
    int minArea = Integer.MAX_VALUE;
    public int minimumAreaRectangle(int[][] points) {
        minArea = Integer.MAX_VALUE;
        var myPoints = new ArrayList<Point>();
        var xPoints = new HashMap<Integer, HashSet<Integer>>();
        var yPoints = new HashMap<Integer, HashSet<Integer>>();
        for (int[] ints : points) {
            var p = new Point(ints[0], ints[1]);
            myPoints.add(p);
            if(!xPoints.containsKey(p.x))  xPoints.put(p.x, new HashSet<Integer>());
            xPoints.get(p.x).add(p.y);

            if(!yPoints.containsKey(p.y))  yPoints.put(p.y, new HashSet<Integer>());
            yPoints.get(p.y).add(p.y);
        }

        // pick two points,
        for (int i = 0; i < myPoints.size(); i++) {
            Point a = myPoints.get(i);
            for (int j = i+1; j < myPoints.size(); j++) {
                Point b = myPoints.get(j);
                if(a.x != b.x && a.y != b.y) {
                    // then find the rest of other two points

                    //target 1
                    int target1x = a.x;
                    int target1y = b.y;

                    //target 2
                    int target2x = b.x;
                    int target2y = a.y;

                    if(hasPoints(target1x, target1y, xPoints) && hasPoints(target2x, target2y, xPoints)) {
                        // update rect size
                        calculateRect(a,b);
                    }
                }
            }
        }
        if(minArea == Integer.MAX_VALUE) return 0;
        return minArea;
    }

    public void calculateRect(Point a, Point b) {
        int width = Math.abs(a.x - b.x);
        int height = Math.abs(a.y - b.y);
        int rect = width * height;
        if (rect == 0) return;
        if (rect < minArea) {
            minArea = rect;
        }
    }

    public boolean hasPoints(int x, int y, HashMap<Integer, HashSet<Integer>> xpoints) {
        if(xpoints.containsKey(x)) {
            return xpoints.get(x).contains(y);
        }
        return false;
    }

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return String.format("(%d,%d)", x, y);
        }
    }
}
