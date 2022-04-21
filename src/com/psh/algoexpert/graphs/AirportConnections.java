package com.psh.algoexpert.graphs;

import java.util.*;

public class AirportConnections {

    public static int airportConnections(List<String> airports,
                                         List<List<String>> routes,
                                         String startingAirport) {
        // build all airports
        var allSet = new HashSet<String>();
        for (String airport : airports) {
            allSet.add(airport);
        }

        // build given routes
        // hashmap : string - arrayList
        var given = new HashMap<String, ArrayList<String>>();
        for (List<String> route : routes) {
            String from = route.get(0);
            String to = route.get(1);
            if (!given.containsKey(from)) {
                var toList = new ArrayList<String>();
                toList.add(to);
                given.put(from, toList);
            } else {
                given.get(from).add(to);
            }
        }

        var globalHistory = new HashMap<String, HashSet<String>>();
        for (String airport : airports) {
            // iterate all airports, build all routes
            // hashmap : string - history
            var history = new HashSet<String>();
            history.add(airport);
            getRoute(airport, history, given);
            globalHistory.put(airport, history);
        }

        // build score list
        var apScoreList = new ArrayList<ApScore>();
        for (String key : globalHistory.keySet()) {
            var aps = new ApScore(key, globalHistory.get(key));
            apScoreList.add(aps);
        }

        // compare from big score first
        // since the question asks min numbers
        apScoreList.sort(new Comparator<ApScore>() {
            @Override
            public int compare(ApScore o1, ApScore o2) {
                if(o1.score < o2.score) return 1;
                else if(o1.score == o2.score) return 0;
                else return -1;
            }
        });

        // check and expand history and check
        // if not found route, then add it
        int count = 0;
        var targetHistory = globalHistory.get(startingAirport);
        for (ApScore apScore : apScoreList) {
            if(apScore.startAirport.equals(startingAirport)){
                continue;
            }

            if(!targetHistory.contains(apScore.startAirport)) {
                targetHistory.addAll(apScore.history);
                count++;
            }

            if(targetHistory.size() == airports.size()) break;
        }
        return count;
    }

    public static class ApScore {
        String startAirport = null;
        HashSet<String> history = null;
        int score = 0;
        public ApScore(String start, HashSet<String> history) {
            this.startAirport = start;
            this.history = history;
            this.score = history.size();
        }
    }

    public static void getRoute(String start,
                                HashSet<String> history,
                                HashMap<String,
                                ArrayList<String>> given) {
        if(!history.contains(start)) history.add(start);
        if(given.containsKey(start)) {
            var nexts = given.get(start);
            for (String next : nexts) {
                if(!history.contains(next)) {
                    history.add(next);
                    getRoute(next, history, given);
                }
            }
        }
    }


    public static class Node {
        public String name = null;
        public ArrayList<Node> connections = null;
        public Node(String name) {
            this.name = name;
            connections = new ArrayList<>();
        }
    }

    public static int airportConnections_wrong(List<String> airports, List<List<String>> routes, String startingAirport) {

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
