package com.psh.algoexpert.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CycleInGraph {

    public class Node {
        ArrayList conn = new ArrayList<Node>();
        int value;
        public Node(int value) {
            this.value = value;
        }
    }

    public boolean cycleInGraph(int[][] edges) {

        var nMap = new HashMap<Integer, Node>();

        // build node, node map
        for (int i = 0; i < edges.length; i++) {
            var node = new Node(i);
            nMap.put(i, node);
        }

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            var node = nMap.get(i);
            if(edge != null && edge.length > 0) {
                for (int e : edge) {
                    var nextNode = nMap.get(e);
                    node.conn.add(nextNode);
                }
            }
        }

        for (int i = 0; i < edges.length; i++) {

            var startNode = nMap.get(i);
            var visited = new HashSet<Node>();
            var queue = new ArrayDeque<Node>();
            queue.add(startNode);
            visited.add(startNode);
            while(queue.size() > 0) {
                var curNode = queue.remove();
                if(curNode.conn.size() > 0) {
                    for (Object o: curNode.conn) {
                        var nextNode = (Node)o;
                        if(nextNode == startNode) {// KEYPOINT
                            return true;
                        } else {
                            if(!visited.contains(nextNode)) {
                                visited.add(nextNode);
                                queue.add(nextNode);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
