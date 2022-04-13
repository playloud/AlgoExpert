package com.psh.algoexpert.strings;
import java.util.*;
public class MinimumCharactersForWords {
    public char[] minimumCharactersForWords(String[] words) {
        var localMap = new HashMap<Character, Integer>();
        var myMap = new HashMap<Character, Integer>();
        for (String word : words) {
            localMap.clear();
            char[] arr = word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];
                if(localMap.containsKey(c))
                    localMap.put(c, localMap.get(c)+1);
                else
                    localMap.put(c,1);
            }
            for (Character key : localMap.keySet()) {
                if(myMap.containsKey(key)) {
                    myMap.put(key, Math.max(localMap.get(key), myMap.get(key)));
                } else {
                    myMap.put(key, localMap.get(key));
                }
            }
        }
        var tempResult = new ArrayList<Character>();
        for (Character key : myMap.keySet()) {
            int count = myMap.get(key);
            for (int i = 0; i < count; i++) {
                tempResult.add(key);
            }
        }
        char[] result = new char[tempResult.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tempResult.get(i);
        }
        return result;
    }
}
