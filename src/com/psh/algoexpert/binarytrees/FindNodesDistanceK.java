package com.psh.algoexpert.binarytrees;

import java.util.*;

public class FindNodesDistanceK {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        var result = new ArrayList<Integer>();
        // bfs nodes, find cpMap
        BinaryTree targetNode = null;

        var cpMap = new HashMap<BinaryTree, BinaryTree>();
        var queue = new ArrayDeque<BinaryTree>();
        queue.add(tree);
        while(queue.size() > 0) {
            var node = queue.remove();
            if(node.value == target) {
                targetNode = node;
            }
            if(node.left != null) {
                queue.add(node.left);
                cpMap.put(node.left, node);
            }
            if(node.right != null) {
                queue.add(node.right);
                cpMap.put(node.right, node);
            }
        }

        if(targetNode == null) return result;

        //going down
        int count = 0;
        queue.clear();
        queue.add(targetNode);
        var tempList = new ArrayList<BinaryTree>();
        while(count <= k) {

            if(queue.size() == 0) break;
            while(queue.size() > 0) {
                tempList.add(queue.remove());
            }

            for (BinaryTree node : tempList) {
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                if(count == k) {
                    result.add(node.value);
                }
            }
            tempList.clear();
            count++;
        }

        // going up
        queue.clear();
        count = 0;
        tempList.clear();
        if(cpMap.containsKey(targetNode)) {
            var parentNode = cpMap.get(targetNode);
            queue.add(parentNode);
            if(k == 1) {
                result.add(parentNode.value);
            } else {
                var upHistory = new HashSet<BinaryTree>();
                upHistory.add(targetNode);
                while(count < k) {
                    while(queue.size() > 0) {
                        var node = queue.remove();
                        upHistory.add(node);
                        tempList.add(node);
                    }
                    count++;
                    for (BinaryTree node : tempList) {
                        if(node.left != null && !upHistory.contains(node.left)) {
                            queue.add(node.left);
                        }
                        if(node.right != null  && !upHistory.contains(node.right)) {
                            queue.add(node.right);
                        }
                        if(cpMap.containsKey(node) && !upHistory.contains(cpMap.get(node))) {
                            queue.add(cpMap.get(node));
                        }
                        if(count == k) {
                            result.add(node.value);
                        }
                    }
                    tempList.clear();
                }
            }
        }
        return result;

    }
}
