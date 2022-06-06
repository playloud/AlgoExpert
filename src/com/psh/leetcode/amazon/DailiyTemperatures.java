package com.psh.leetcode.amazon;
//https://leetcode.com/submissions/detail/711720347/
//https://leetcode.com/contest/weekly-contest-61/problems/daily-temperatures/
import java.util.*;

// Given an array of integers temperatures represents the daily temperatures,
// return an array answer such that answer[i] is the number of days you have to wait
// after the ith day to get a warmer temperature.
// If there is no future day for which this is possible, keep answer[i] == 0 instead.
public class DailiyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        var stack = new Stack<Node>();
        var nodes = new ArrayList<Node>();

        // build nodes
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];;
            nodes.add(new Node(i, temp));
        }

        // do stack and find the big one
        for (Node node : nodes) {
            if(stack.isEmpty()) {
                stack.push(node);
            } else {
                while(!stack.isEmpty() && stack.peek().value < node.value) {
                    var popped = stack.pop();
                    result[popped.index] = node.index - popped.index;
                }
                stack.push(node);
            }
        }

        return result;
    }

    class Node {
        int index;
        int value ;
        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
