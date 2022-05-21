package com.psh.leetcode.string;
import java.util.*;
public class MaximumLengthOfAConcatenatedStringwithUniqueCharacters_1239 {

    int maxLength = 0;
    public int maxLength(List<String> arr) {
        maxLength = 0;
        var mySet = new HashSet<Character>();
        searchMax(0, arr, mySet);
        return maxLength;
    }

    public void searchMax(int startIndex, List<String> arr, HashSet<Character> history) {
        if(maxLength < history.size()) {
            maxLength = history.size();
        }

        if(startIndex >= arr.size()) return;

        for (int i = startIndex; i < arr.size(); i++) {
            String curStr = arr.get(i);
            char[] carr = curStr.toCharArray();
            if(isUniq(carr)) {
                boolean isDup = false;
                for (char c : carr) {
                    if(history.contains(c)) {
                        isDup = true;
                        break;
                    }
                }
                if(!isDup) {
                    // now recursion
                    for (char c : carr) {
                        history.add(c);
                    }
                    searchMax(i+1, arr, history);
                    for (char c : carr) {
                        history.remove(c);
                    }
                }
            }
        }
    }
    HashSet<Character> tempSet = new HashSet<>();
    public boolean isUniq(char[] arr) {
        tempSet.clear();
        for (char c : arr) {
            tempSet.add(c);
        }
        if(tempSet.size() == arr.length) return true;
        return false;
    }






    public int maxLength_notWork(List<String> arr) {
        var nodes = new ArrayList<Node>();
        for (String str : arr) {
            nodes.add(new Node(str));
        }

        nodes.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o2.str.length() > o1.str.length()) return 1;
                else if(o2.str.length() == o1.str.length()) return 0;
                return -1;
            }
        });

        if(nodes.size() == 1)  {
            if(nodes.get(0).isUniq()){
                return nodes.get(0).str.length();
            }
            return 0;
        }

        int maxSize = 0;
        while(true) {
            boolean hasMergedOne = false;
            outer: for (int i = 0; i < nodes.size(); i++) {
                for (int j = i; j < nodes.size(); j++) {
                    if(i == j) continue;

                    int size =0;
                    Node n1 = nodes.get(i);
                    Node n2 = nodes.get(j);

                    if(n1.isUniq() && n2.isUniq()) {

                        if(maxSize < n1.str.length()) maxSize = n1.str.length();
                        if(maxSize < n2.str.length()) maxSize = n2.str.length();

                        if(n1.isGoodToMerge(n2)) {
                            size = n1.str.length() + n2.str.length();
                            if(maxSize < size) {
                                maxSize = size;
                            }

                            Node nextNode = n1.mergeNode(n2);
                            nodes.remove(n1);
                            nodes.remove(n2);
                            nodes.add(nextNode);
                            hasMergedOne = true;
                            break outer;
                        }
                    }
                }
            }
            if(!hasMergedOne) break;
        }
        return maxSize;
    }

    class Node implements Comparable<Node> {
        String str = null;
        HashSet<Character> mySet = null;
        char[] arr = null;
        public Node(String str) {
            this.str = str;
            this.arr = str.toCharArray();
            mySet = new HashSet<>();
            for (char c : arr) {
                mySet.add(c);
            }
        }
        public boolean isGoodToMerge(Node n) {
            if(mySet.size() != str.length()) return false;
            for (char c : arr) {
                if(n.mySet.contains(c))
                    return false;
            }
            return true;
        }

        public boolean isUniq() {
            if(str.length() != mySet.size()) return false;
            return true;
        }

        public Node mergeNode(Node n) {
            Node nextNode = new Node(n.str+this.str);
            return nextNode;
        }

        @Override
        public int compareTo(Node n) {
            if(n.str.length() > this.str.length()) return 1;
            else if(n.str.length() == this.str.length()) return 0;
            return -1;
        }
    }

}
