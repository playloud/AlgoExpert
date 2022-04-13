package com.psh.algoexpert.graphs;
import java.util.*;

public class BreadthFirstSearch {
    // Do not edit the class below except
    // for the breadthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            var queue = new ArrayDeque<Node>();
            queue.add(this);
            while(queue.size() > 0) {
                var tempQueue = new ArrayDeque<Node>();
                while(queue.size()>0) {
                    var n = queue.remove();
                    array.add(n.name);
                    if(n.children != null && n.children.size()>0) {
                        for (Node child : n.children) {
                            tempQueue.add(child);
                        }
                    }
                }
                if(tempQueue.size() > 0)
                    queue = tempQueue;
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
