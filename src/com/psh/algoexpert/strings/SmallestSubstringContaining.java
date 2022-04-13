package com.psh.algoexpert.strings;

import java.util.HashMap;
import java.util.HashSet;

public class SmallestSubstringContaining {

    public static String smallestSubstringContaining(String bigString, String smallString) {

        char[] src = bigString.toCharArray();
        char[] target = smallString.toCharArray();
        var mySet = new HashSet<Character>();
        var myMap = new HashMap<Character, Integer>();

        int smallestCount = Integer.MAX_VALUE;
        String smallestSub = "";

        // build set and map
        for (char c : target) {
            if(!mySet.contains(c)) {
                mySet.add(c);
            }
            if(myMap.containsKey(c)) {
                myMap.put(c, myMap.get(c)+1);
            } else {
                myMap.put(c, 1);
            }
        }

        // iterate and reduce
        var buf = new StringBuffer();
        for (int i = 0; i < bigString.length(); i++) {
            buf.delete(0, buf.length());
            var tempMap = (HashMap<Character, Integer>)myMap.clone();

            for (int j = i; j < bigString.length(); j++) {
                char c = src[j];
                buf.append(c);
                if(mySet.contains(c)) {
                    int count = tempMap.get(c);
                    count--;
                    if(count < 0) count = 0;
                    tempMap.put(c, count);
                    // check all zero
                    if(isAllZero(tempMap)) {
                        //found
                        if(smallestCount > buf.length()) {
                            smallestCount = buf.length();
                            smallestSub = buf.toString();
                        }
                    }
                }
            }
        }

        return smallestSub;
    }

    public static boolean isAllZero(HashMap<Character, Integer> myMap) {
        for (Character key : myMap.keySet()) {
            if(myMap.get(key) > 0) return false;
        }
        return true;
    }
}
