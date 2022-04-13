package com.psh.algoexpert.graphs;
import java.util.*;
public class RectangleMania {
    static int rectCount = 0;
    static HashSet<String> globalHistory = null;
    public static int rectangleMania(List<Integer[]> coords) {
        rectCount = 0;
        globalHistory = new HashSet<>();
        var allPoints = new ArrayList<Point>();
        for (int i = 0; i < coords.size(); i++) {
            Integer[] cord = coords.get(i);
            var p = new Point(cord[0], cord[1]);
            p.id = i;
            allPoints.add(p);
        }
        var points = new ArrayList<Point>();
        var history = new HashSet<Point>();
        buildUp(points, history, allPoints);
        return rectCount;
    }

    public static void buildUp(ArrayList<Point> points, HashSet<Point> history, ArrayList<Point> allPoints) {
        if(points.size() == 4) {
            if(isRect(points))
                rectCount++;
        } else {
            for (int i = 0; i < allPoints.size(); i++) {
                var curP = allPoints.get(i);
                if(!history.contains(curP)) {
                    points.add(curP);
                    history.add(curP);
                    buildUp(points, history, allPoints);
                    points.remove(points.size()-1);
                    history.remove(curP);
                }
            }
        }
    }

    // this is tricky
    static StringBuffer sbuf = new StringBuffer();
    static int[] indice = new int[4];
    public static boolean isRect(ArrayList<Point> points) {
        sbuf.delete(0, sbuf.length());
        for (int i = 0; i < 4; i++) {
            indice[i] = points.get(i).id;
        }
        Arrays.sort(indice);
        for (int i : indice) {
            sbuf.append(i+"-");
        }
        var cntx = new HashMap<Integer, Integer>();
        var cnty = new HashMap<Integer, Integer>();
        for (Point p : points) {
            if(cntx.containsKey(p.x)) {
                cntx.put(p.x, (cntx.get(p.x)+1));
            } else {
                cntx.put(p.x, 1);
            }

            if(cnty.containsKey(p.y)) {
                cnty.put(p.y, (cnty.get(p.y)+1));
            } else {
                cnty.put(p.y, 1);
            }
        }
        String strHistory = sbuf.toString();

        if(globalHistory.contains(strHistory))
            return false;

        if(cntx.keySet().size() == 2 && cnty.keySet().size()==2) {
            globalHistory.add(strHistory);
            return true;
        }
        return false;
    }





    static class Point {
        public int x; public int y;
        public int id;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
