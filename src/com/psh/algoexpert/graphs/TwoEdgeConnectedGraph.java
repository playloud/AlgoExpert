package com.psh.algoexpert.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoEdgeConnectedGraph {
    public boolean twoEdgeConnectedGraph(int[][] edges) {

        // build nodes
        var allConns = new HashMap<Integer, HashSet<Integer>>();
        var _allNodes = new HashSet<Integer>();

        for (int i = 0; i < edges.length; i++) {
            int start = i;
            _allNodes.add(i);
            allConns.put(start, new HashSet<Integer>());
            for (int j = 0; j < edges[i].length; j++) {
                int next = edges[i][j];
                allConns.get(start).add(next);
            }
        }

        var allNodes = new ArrayList<Integer>();
        allNodes.addAll(_allNodes);

        var history = new HashSet<Integer>();
        for (int i = 0; i < allNodes.size(); i++) {
            int nodeFrom = allNodes.get(i);
            for (int j = i; j < allNodes.size(); j++) {
                int nodeTo = allNodes.get(j);
                if (nodeFrom == nodeTo) continue;
                else {
                    pathCount = 0;
                    history.clear();
                    history.add(nodeFrom);
                    getAllPathes(nodeFrom, nodeTo, history, allConns);
                    System.out.println(
                            String.format("%d -> %d, %d", nodeFrom, nodeTo, pathCount));
                    if (pathCount <= 1)
                        return false;

                }
            }
        }
        return true;
    }

    public int pathCount = 0;

    public void getAllPathes(int origin, int target,
                             HashSet<Integer> history,
                             HashMap<Integer, HashSet<Integer>> allConns) {
        if (pathCount > 1) return;

        var myNexts = allConns.get(origin);
        for (Integer next : myNexts) {
            if (target == next) {
                history.add(target);
                System.out.println(history);
                pathCount++;
                // found
            } else {
                if (!history.contains(next)) {
                    history.add(next);
                    getAllPathes(next, target, history, allConns);
                    history.remove(next);
                }
            }
        }
    }
}
