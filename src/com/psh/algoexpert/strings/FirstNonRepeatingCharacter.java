package com.psh.algoexpert.strings;

import java.util.HashSet;

public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter(String string) {

        char[] arr = string.toCharArray();
        var myset = new HashSet<Character>();
        boolean[] map = new boolean['z'-'a'+1];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(myset.contains(c)) {
                map[c-'a'] = true;
            } else {
                myset.add(c);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(!map[c-'a']) return i;
        }

        return -1;
    }

}
