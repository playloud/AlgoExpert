//https://www.algoexpert.io/questions/Suffix%20Trie%20Construction
//// PSH 01/18/22 : passed
package com.psh.algoexpert.tries;


import java.util.*;

public class SuffixTrieConstruction {
    // Do not edit the class below except for the
    // populateSuffixTrieFrom and contains methods.
    // Feel free to add new properties and methods
    // to the class.
    public static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    public static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {

            if(str.isEmpty() || str.isBlank()) return;

            char[] chars = str.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                TrieNode curNode = root;
                for (int j = i; j < chars.length; j++) {
                    char c = chars[j];
                    if(curNode.children.containsKey(c)) {
                        curNode = curNode.children.get(c);
                    } else {
                        var node = new TrieNode();
                        curNode.children.put(c, node);
                        curNode = node;
                    }

                    if(j == chars.length-1) {
                        curNode.children.put(endSymbol, null);
                    }
                }
            }
        }

        public boolean contains(String str) {

            char[] chars = str.toCharArray();
            TrieNode curNode = root;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if(curNode.children.containsKey(c)) {
                    curNode = curNode.children.get(c);
                } else {
                    return false;
                }

                if(i == chars.length -1) {
                    if(curNode.children.containsKey(endSymbol)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
