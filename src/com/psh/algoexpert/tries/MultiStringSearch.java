package com.psh.algoexpert.tries;
import java.util.*;
public class MultiStringSearch {


    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {

        var suffixTrie = new SuffixTrie(bigString);
        var result = new ArrayList<Boolean>();

        for (String str : smallStrings) {
            result.add(suffixTrie.contains(str));
        }

        // Write your code here.
        return result;
    }


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
            }
            return true;
        }
    }

}
