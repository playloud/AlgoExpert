package com.psh.algoexpert.binarytrees;
import java.util.*;
public class RightSmallerThan {

    public static List<Integer> rightSmallerThan(List<Integer> array) {
        Node root = null;
        var myMap = new HashMap<Integer, Node>();
        var result = new ArrayList<Integer>();

        for (int i = array.size()-1; i >=0; i--) {
            int value = array.get(i);
            totalRightSmaller = 0;
            if(root == null) {
                root = new Node(i, value, myMap);
            } else {
                root.insert(i, value, myMap);
            }
            result.add(0, totalRightSmaller);
        }
        return result;
    }
    static int totalRightSmaller = 0;
    public static class Node {

        int value;
        int index;

        Node left = null;
        Node right = null;

        int leftCount = 0;
        int rightSmallerCount = 0;

        public Node(int index, int value, HashMap<Integer, Node> myMap) {
            this.index = index;
            myMap.put(index, this);
            this.value = value;
        }

        public void insert(int index, int value, HashMap<Integer, Node> myMap) {
            if (value <= this.value) {
                if (left == null) {
                    left = new RightSmallerThan.Node(index, value, myMap);
                } else {
                    left.insert(index,value, myMap);
                }
                leftCount++;
            } else if(value > this.value){
                totalRightSmaller += this.leftCount + 1;
                if (right == null) {
                    right = new RightSmallerThan.Node(index, value, myMap);
                    right.rightSmallerCount = totalRightSmaller;
                } else {
                    right.insert(index, value, myMap);
                }
            }
        }
    }
}
