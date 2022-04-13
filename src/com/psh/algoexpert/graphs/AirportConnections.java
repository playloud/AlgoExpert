package com.psh.algoexpert.graphs;

import java.util.*;

public class AirportConnections {

    public static class Node {
        public String name = null;
        public ArrayList<Node> connections = null;
        public Node(String name) {
            this.name = name;
            connections = new ArrayList<>();
        }
    }

    public static int airportConnections(List<String> airports, List<List<String>> routes, String startingAirport) {

        // build node maps
        var nmNodes = new HashMap<String, Node>();
        for (String ap : airports) {
            var n = new Node(ap);
            nmNodes.put(ap, n);
        }

        for (List<String> route : routes) {
            var from = route.get(0);
            var to = route.get(1);
            var node1 = nmNodes.get(from);
            var node2 = nmNodes.get(to);
            if(!node1.connections.contains(node2)) node1.connections.add(node2);
            if(!node2.connections.contains(node1)) node2.connections.add(node1);
        }

        // now breath search
        var visited = new HashSet<Node>();
        var startNode = nmNodes.get(startingAirport);
        var queue = new ArrayDeque<Node>();
        queue.add(startNode);
        while(queue.size() > 0) {
            var n = queue.remove();
            if(n.connections.size() > 0) {
                for (Node child : n.connections) {
                    if(!visited.contains(child)){
                        visited.add(child);
                        queue.add(child);
                    }
                }
            }
        }

        int count = 0;
        for (Node node : nmNodes.values()) {
            if(!visited.contains(node)) {
                System.out.println(node.name);
                count++;
            }
        }
        return count;
    }
}
