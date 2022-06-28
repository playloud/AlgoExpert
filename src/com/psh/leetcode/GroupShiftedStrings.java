package com.psh.leetcode;
import java.util.*;
//https://leetcode.com/problems/group-shifted-strings/
public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        var result = new ArrayList<List<String>>();

        var myMap = new HashMap<String, ArrayList<String>>();
        var myStrs = new ArrayList<MyStr>();
        for (String str : strings) {
            var myStr = new MyStr(str);
            if(!myMap.containsKey(myStr.key))
                myMap.put(myStr.key, new ArrayList<>());
            myMap.get(myStr.key).add(myStr.str);
        }

        for (String key : myMap.keySet()) {
            result.add(myMap.get(key));
        }

        return result;
    }

    class MyStr {
        String str = null;
        String key = null;
        public MyStr(String str) {
            this.str = str;
            char min = 'z';
            char[] arr = str.toCharArray();
            for (char c : arr) {
                min = (char)Math.min((int)min, (int)c);
            }
            key = "";
            var buf = new StringBuffer();

            for (int i = 0; i < arr.length-1; i++) {
                int diff = arr[i] - arr[i+1];
                if(diff < 0) {
                    diff = 26 + diff;
                }
                buf.append((char)diff);
            }
            if(buf.length() > 0) key = buf.toString();
        }
    }
}
