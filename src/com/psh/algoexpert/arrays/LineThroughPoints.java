package com.psh.algoexpert.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class LineThroughPoints {

    int maxSize = 0;

    public int lineThroughPoints(int[][] points) {
        maxSize = 1;
        var pobjs = new ArrayList<PObj>();
        for (int i = 0; i < points.length;i++) {
            int[] parr = points[i];
            pobjs.add(new PObj(parr[0], parr[1]));
        }

        // pick 2 points
        for (int i = 0; i < pobjs.size(); i++) {;
            PObj p1 = pobjs.get(i);
            for (int j = i; j < pobjs.size(); j++) {
                PObj p2 = pobjs.get(j);
                if(p1 == p2) continue;
                checkSamethings(p1, p2, pobjs);
            }
        }
        return maxSize;
    }

    public void checkSamethings(PObj p1, PObj p2, ArrayList<PObj> all) {
        var history = new HashSet<PObj>();
        history.add(p1);
        history.add(p2);
        for (PObj target : all) {
            if(target == p1 || target == p2) continue;
            else {
                if(isSameRatio(p1, p2, target)) {
                    history.add(target);
                }
            }
        }
        if(maxSize < history.size()) {
            maxSize = history.size();
        }
    }

    public boolean isSameRatio(PObj p1, PObj p2, PObj p3) {
        float ra1 = (p1.x - p2.x) / (p1.y - p2.y);
        float ra2 = (p1.x - p3.x) / (p1.y - p3.y);
        if(ra1 == ra2) return true;
        return false;
    }

    public class PObj {
        public float x,y;
        public PObj(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
