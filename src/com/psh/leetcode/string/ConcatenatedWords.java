package com.psh.leetcode.string;
import java.util.*;
//https://leetcode.com/problems/concatenated-words/
public class ConcatenatedWords {

    int maxSize = 0;
    ArrayList<String> result = new ArrayList<String>();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {

        result.clear();
        maxSize = 0;
        var mySet = new HashSet<String>();

        //build set
        for (String word : words) {
            if(word.equals("")) continue;
            if(maxSize < word.length()) {
                maxSize = word.length();
            }
            mySet.add(word);
        }
        for (String word : words) {
            if(word.equals("")) continue;
            if(isConcat(word, mySet)) {
                result.add(word);
            }
        }
        return result;
    }

    public boolean isConcat(String word, HashSet<String> mySet) {
        int len = word.length();
        for (int i = 0; i < len; i++) {
            String suffix = word.substring(i);
            String prefix = word.substring(0,i);
            if(mySet.contains(prefix) && (mySet.contains(suffix) || isConcat(suffix, mySet))) {
                return true;
            }
        }
        return false;
    }










































    public List<String> findAllConcatenatedWordsInADict_overflow(String[] words) {

        result.clear();
        maxSize = 0;
        var mySet = new HashSet<String>();

        //build set
        for (String word : words) {
            if(maxSize < word.length()) {
                maxSize = word.length();
            }
            mySet.add(word);
        }
        StringBuffer sbuf = new StringBuffer();
        for (String word : words) {
            sbuf.delete(0, sbuf.length());
            search(sbuf, word, mySet);
        }
        return result;
    }

    int curLength = 0;

    public void search(StringBuffer preFix, String src, HashSet<String> set) {
        int prefixSize = preFix.length();
        for (int i = 0; i <= src.length(); i++) {
            preFix.delete(prefixSize, preFix.length());
            String sub = src.substring(0, i);
            if(i == src.length() && preFix.length() > 0 && set.contains(sub)) {
                preFix.append(src);
                result.add(preFix.toString());

            } else if(set.contains(sub)) {
                if(i < src.length()) {
                    String rest = src.substring(i);
                    preFix.append(sub);
                    search(preFix, rest, set);
                }
            }
        }
        preFix.delete(prefixSize, preFix.length());
    }


    public List<String> findAllConcatenatedWordsInADict_incorrect(String[] words) {
        result.clear();
        maxSize = 0;
        var mySet = new HashSet<String>();

        //build set
        for (String word : words) {
            if(maxSize < word.length()) {
                maxSize = word.length();
            }
            mySet.add(word);
        }

        //iter and start
        for (String word : words) {
            search(word, mySet, words);
        }
        return result;
    }

    public void search(String curStr, HashSet<String> mySet, String[] words) {
        if(curStr.equals("")) return;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("")) continue;
            String nextWord = curStr+words[i];
            if(nextWord.length() <= maxSize) {
                System.out.println(nextWord);
                if(mySet.contains(nextWord)){
                    result.add(nextWord);
                }
                search(nextWord, mySet, words);
            }
        }
    }

    public int isPartOrSame(String src, String[] words) {
        for (String word : words) {
            if(word.equals(src)) {
                return 2;
            } else if(word.startsWith(src)){
                return 1;
            }
        }
        return 0;
    }
}
