package com.psh.leetcode.string;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestHappyString2 {

    public String longestDiverseString(int a, int b, int c) {

        var maxQ = new PriorityQueue<Node>();
        var nodeA = new Node(a, 'a');
        var nodeB = new Node(b, 'b');
        var nodeC = new Node(c, 'c');
        if(a > 0)
            maxQ.add(nodeA);
        if(b > 0)
            maxQ.add(nodeB);
        if(c > 0)
            maxQ.add(nodeC);
        var buf = new StringBuffer();
        while(maxQ.size() > 0) {

            var curNode = maxQ.poll();
            if(buf.length() >= 2 &&
                    buf.charAt(buf.length()-1) == curNode.c &&
                    buf.charAt(buf.length()-2) == curNode.c) {

                if (maxQ.size() == 0)
                    break;

                var nextNode = maxQ.poll();
                nextNode.value--;
                buf.append(nextNode.c);
                if(nextNode.value > 0)
                    maxQ.add(nextNode);
                if(curNode.value > 0)
                    maxQ.add(curNode);
            } else {
                curNode.value--;
                buf.append(curNode.c);
                if(curNode.value > 0)
                    maxQ.add(curNode);
            }
        }
        return buf.toString();
    }

    class Node implements Comparable<Node> {

        int value = 0;
        char c = ' ';
        public Node(int value, char c) {
            this.value = value;
            this.c = c;
        }
        @Override
        public int compareTo(Node n2) {
            if(this.value > n2.value) {
                return -1;
            } else if(this.value == n2.value) {
                return 0;
            }
            return 1;
        }
    }



}
