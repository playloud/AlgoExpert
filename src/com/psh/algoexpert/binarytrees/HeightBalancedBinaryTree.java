package com.psh.algoexpert.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class HeightBalancedBinaryTree {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class NodeHeight {
        public int lh = -1;
        public int rh = -1;
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {

        HashMap<BinaryTree, NodeHeight> hMap = new HashMap<>();
        HashMap<BinaryTree, BinaryTree> cpMap = new HashMap<>();
        var leafNods = new ArrayDeque<BinaryTree>();
        var tempQ = new ArrayDeque<BinaryTree>();

        tempQ.add(tree);
        // Find leaf node, build cpMap, hMap
        while (tempQ.size() > 0) {
            var node = tempQ.remove();
            hMap.put(node, (new NodeHeight()));
            if(node.left != null){
                cpMap.put(node.left, node);
                tempQ.add(node.left);
            }
            if(node.right != null) {
                cpMap.put(node.right, node);
                tempQ.add(node.right);
            }
            if(node.left == null && node.right == null) {
                leafNods.add(node);
                hMap.get(node).lh = 0;
                hMap.get(node).rh = 0;
            }
        }

        tempQ.clear();
        while(leafNods.size() > 0) {

            var node = leafNods.remove();

            if(node == tree) break;

            //get Parent
            var parent = cpMap.get(node);

            // check me is left, update value
            if(parent.left == node) {
                //KEY POINT
                hMap.get(parent).lh = Math.max(hMap.get(node).lh, hMap.get(node).rh) +1;
                if(parent.right == null) hMap.get(parent).rh = 0;
            }
            if(parent.right == node) {
                //KEY POINT
                hMap.get(parent).rh = Math.max(hMap.get(node).lh, hMap.get(node).rh) +1;
                if(parent.left == null) hMap.get(parent).lh = 0;
            }

            if(hMap.get(parent).lh >= 0 && hMap.get(parent).rh >=0) {
                //Key Point
                var result = Math.max(hMap.get(parent).lh, hMap.get(parent).rh) - Math.min(hMap.get(parent).lh, hMap.get(parent).rh);
                //KEY POINT, if parent left or right still in the tempq, it means calculation is not done yet
                if(!tempQ.contains(parent.left) && !tempQ.contains(parent.right) && result > 1) {
                    return false;
                }
            }

            if(!tempQ.contains(parent))
                tempQ.add(parent);

            // queue switching
            if(leafNods.size() == 0) {
                leafNods = tempQ;
                tempQ = new ArrayDeque<BinaryTree>();
            }
        }

        return true;
    }
}
