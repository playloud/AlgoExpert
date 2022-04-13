//https://www.algoexpert.io/questions/Generate%20Document
package com.psh.algoexpert.strings;

import java.util.HashMap;

public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {

        var charMap = new HashMap<Character, Integer>();
        var docMap = new HashMap<Character, Integer>();

        var charArr = characters.toCharArray();
        var docArr = document.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (charMap.containsKey(c)) {
                int value = charMap.get(c);
                ++value;
                charMap.put(c, value);
            } else {
                charMap.put(c, 1);
            }
        }

        for (int i = 0; i < docArr.length; i++) {
            char c = docArr[i];
            if (docMap.containsKey(c)) {
                int value = docMap.get(c);
                ++value;
                docMap.put(c, value);
            } else {
                docMap.put(c, 1);
            }
        }

        // check total # keys
        if(charMap.keySet().size() < docMap.keySet().size())
            return false;

        // check each key and values
        for (char c : docMap.keySet()) {
            int valueDocs = docMap.get(c);
            if(charMap.get(c) != null) {
                int valueChars = charMap.get(c);
                if(valueDocs > valueChars)
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
