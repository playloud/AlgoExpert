package com.psh.algoexpert.graphs;

import java.util.*;

public class DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {

            array.add(name);
            if(this.children != null) {
                for (Node kid : children) {
                    kid.depthFirstSearch(array);
                }
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
