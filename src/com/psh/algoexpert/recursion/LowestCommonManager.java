package com.psh.algoexpert.recursion;

import java.util.*;

public class LowestCommonManager {

    public static OrgChart getLowestCommonManager(OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {

        // bfs chart
        var queue = new ArrayDeque<OrgChart>();
        var cpMap = new HashMap<OrgChart, OrgChart>();
        queue.add(topManager);
        while(queue.size() > 0) {
            var node = queue.remove();
            if(node.directReports != null && node.directReports.size() > 0) {
                for (OrgChart child : node.directReports) {
                    cpMap.put(child, node);
                    queue.add(child);
                }
            }
        }

        // search set reportOne, including root
        OrgChart curNode = null;
        var oneSet = new HashSet<OrgChart>();
        curNode = reportOne;
        while(true) {
            oneSet.add(curNode);
            if(cpMap.containsKey(curNode)) {
                curNode = cpMap.get(curNode);
            } else {
                break;
            }
        }

        // now check from reportTwo;
        curNode = reportTwo;
        while(true) {
            if(oneSet.contains(curNode)) {
                return curNode;
            } else {
                if(cpMap.containsKey(curNode)) {
                    curNode = cpMap.get(curNode);
                } else {
                    break;
                }
            }
        }
        return null;
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<OrgChart>();
        }

        // This method is for testing only.
        public void addDirectReports(OrgChart[] directReports) {
            for (OrgChart directReport : directReports) {
                this.directReports.add(directReport);
            }
        }
    }
}
