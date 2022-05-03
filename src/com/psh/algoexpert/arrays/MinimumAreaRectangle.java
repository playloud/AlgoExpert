package com.psh.algoexpert.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class MinimumAreaRectangle {
    int minArea = Integer.MAX_VALUE;

    public int minimumAreaRectangle(int[][] points) {
        minArea = Integer.MAX_VALUE;
        var myPoints = new ArrayList<Point>();
        for (int[] ints : points) {
            var p = new Point(ints[0], ints[1]);
            myPoints.add(p);
        }
        var history = new HashSet<Point>();
        getRects(0, history, myPoints);
        if (minArea == Integer.MAX_VALUE) return 0;
        return minArea;
    }

    public void getRects(int startIndex, HashSet<Point> history, ArrayList<Point> allPoints) {
        if (history.size() == 4) {

            if (checkHistory(history, "(0,0)") &&
                    checkHistory(history, "(0,4)") &&
                    checkHistory(history, "(6,4)") &&
                    checkHistory(history, "(6,0)")) {
                int breakTime = 123;
            }

            if (isRect(history)) {
                updateRects(history);
            }
        } else {
            if (startIndex >= allPoints.size()) return;
            for (int i = startIndex; i < allPoints.size(); i++) {
                Point p = allPoints.get(i);
                if (!history.contains(p)) {
                    history.add(p);
                    getRects(i + 1, history, allPoints);
                    history.remove(p);
                }
            }
        }
    }

    public void updateRects(HashSet<Point> history) {
        var points = new ArrayList<Point>();
        points.addAll(history);
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);
        Point d = points.get(3);
        if (a.x != b.x && a.y != b.y) {
            calculateRect(a, b);
        } else if (a.x != c.x && a.y != c.y) {
            calculateRect(a, c);
        } else if (a.x != d.x && a.y != d.y) {
            calculateRect(a, d);
        }
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

    public boolean isOrthgonal(Point a, Point b, Point c) {
        boolean result = isOrth(a, b, c);
        boolean result2 = isOrth(b, c, a);
        boolean result3 = isOrth(c, a, b);
        return (result || result2 || result3);
    }

    public boolean isOrth(Point a, Point b, Point c) {
        boolean result = (b.x - a.x) * (b.x - c.x) + (b.y - a.y) * (b.y - c.y) == 0;
        return result;
    }

    boolean isRect(HashSet<Point> history) {
        if (history.size() != 4) return false;
        var arr = new ArrayList<Point>();
        arr.addAll(history);
        return isRectangle(arr.get(0), arr.get(1), arr.get(2), arr.get(3));
    }

    boolean isRectangle(Point a, Point b, Point c, Point d) {
        return isOrthgonal(a, b, c) &&
                isOrthgonal(b, c, d) &&
                isOrthgonal(c, d, a);
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

    public boolean checkHistory(HashSet<Point> history, String check) {
        for (Point point : history) {
            if (point.toString().equals(check)) return true;
        }
        return false;
    }

}
