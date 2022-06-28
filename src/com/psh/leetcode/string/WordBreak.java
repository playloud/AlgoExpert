package com.psh.leetcode.string;
import java.util.*;
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        myResult = true;

        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;

        if (wordDict.size() > 1) {
            var mySet = new HashSet<String>();
            for (String word : wordDict) {
                mySet.add(word);
            }

        } else {
            return wordDict.contains(s);
        }

        return dp[dp.length-1];
    }

    public void myDPSol(String str, int startIndex, boolean[] dp) {
        for (int i = startIndex; i < str.length(); i++) {
            for (int j = 0; j < dp.length; j++) {
                
            }    
        }
    }

    boolean myResult = false;
    public boolean wordBreak_j12NW(String s, List<String> wordDict) {
        //maintaining two sets for memoization
        myResult = false;
        var hist = new ArrayList<String>();

        if (wordDict.size() > 1) {
            var mySet = new HashSet<String>();
            var antiSet = new HashSet<String>();

            for (String word : wordDict) {
                mySet.add(word);
            }

            myCheck(s, hist, antiSet, mySet);
        } else {
            return wordDict.contains(s);
        }
        return myResult;
    }

    public void myCheck(String s, ArrayList<String> hist, HashSet<String> antiSet, HashSet<String> mySet) {

        if(myResult)
            return;

        if(s.equals("")) {
            myResult = true;
            return;
        }

        if(antiSet.contains(s))
            return;

        boolean isFound = false;
        for (String word : mySet) {
            if(s.startsWith(word)) {
                isFound = true;
                if(s.equals(word)) {
                    myResult = true;
                    break;
                } else {
                    hist.add(word);
                    myCheck(s.substring(word.length()), hist, antiSet, mySet);
                    hist.remove(hist.size()-1);
                }
            }
            if(antiSet.contains(s)) return;
        }

        if(!isFound) {
            //now build up antiSet
            antiSet.add(s);
//            if(hist.size() > 0) {
//                var sbuf = new StringBuffer();
//                sbuf.append(s);
//                for (int i = hist.size()-1; i >0; i--) {
//                    sbuf.insert(0, hist.get(i));
//                    antiSet.add(sbuf.toString());
//                }
//            }
        }
    }




    public boolean wordBreak_notwork(String s, List<String> wordDict) {
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
