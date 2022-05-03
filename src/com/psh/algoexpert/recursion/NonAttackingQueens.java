package com.psh.algoexpert.recursion;

import java.util.*;

public class NonAttackingQueens {
    int totalResult = 0;
    Point[][] allPos = null;
    public int nonAttackingQueens(int n) {
        totalResult = 0;
        allPos = new Point[n][n];
        for (int i = 0; i < n; i++) {
            allPos[i] = new Point[n];
            for (int j = 0; j < n; j++) {
                allPos[i][j] = new Point(i, j);
            }
        }
        var qpos = new ArrayList<Point>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Point initialPoint = allPos[i][j];
                qpos.add(initialPoint);
                getPath(n, qpos);
                qpos.remove(initialPoint);
            }
        }
        return totalResult;
    }

    public void getPath(int n, ArrayList<Point> qpos) {
        if (qpos.size() == n) {
            totalResult++;
            return;
        }
        Point lastPoint = qpos.get(qpos.size() - 1);
        boolean isInit = true;
        boolean isGood = true;
        for (int i = lastPoint.x; i < n; i++) {
            int startJ = 0;

            if (isInit) {
                startJ = lastPoint.y;
                isInit = false;
            } else
                startJ = 0;

            for (int j = startJ; j < n; j++) {
                if (i == lastPoint.x && j == lastPoint.y) continue;
                //System.out.println(String.format("%d, %d", i, j));
                //check new pos
                isGood = true;
                for (int k = 0; k < qpos.size(); k++) {
                    if (qpos.get(k).isQPath(i, j)) {
                        isGood = false;
                        break;
                    }
                }
                if (isGood) {
                    Point np = allPos[i][j];
                    qpos.add(np);
                    getPath(n, qpos);
                    qpos.remove(np);
                }
            }
        }
    }
    public class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public boolean isQPath(int i, int j) {
            if (this.x == i || this.y == j) return true;
            if (Math.abs(i - x) == Math.abs(j - y)) return true;
            return false;
        }
    }
}
