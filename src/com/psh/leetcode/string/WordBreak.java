package com.psh.leetcode.string;
import java.util.*;
public class WordBreak {

    boolean myResult = false;
    public boolean wordBreak(String s, List<String> wordDict) {
        myResult = false;
        if (wordDict.size() > 1) {
            var mySet = new HashSet<String>();
            for (String word : wordDict) {
                mySet.add(word);
            }
            isStarteWith(s, mySet);
        } else {
            return wordDict.contains(s);
        }

        return myResult;
    }

    public void isStarteWith(String s, HashSet<String> mySet) {
        if(myResult) return;
        for (String word : mySet) {
            if(s.startsWith(word)) {
                if(s.equals(word)) {
                    myResult = true;
                    break;
                }
                else {
                    isStarteWith(s.substring(word.length()), mySet);
                }
            }
        }
    }


    public boolean wordBreak_old(String s, List<String> wordDict) {

        if (wordDict.size() > 1) {
            var mySet = new HashSet<String>();
            for (String word : wordDict) {
                mySet.add(word);
            }
            return mySol(s, mySet);
        } else {
            return wordDict.contains(s);
        }
    }

    public boolean mySol(String str, HashSet<String> mySet) {

        //if(str.equals("")) return true;

        for (int i = 0; i <= str.length(); i++) {
            String prefix = str.substring(0,i);
            String suffix = str.substring(i);
            System.out.println(prefix+"=>"+suffix);
            if(mySet.contains(prefix) && (suffix.equals("")|| mySet.contains(suffix) || mySol(suffix, mySet))) {
                return true;
            }
        }
        return false;
    }


}
