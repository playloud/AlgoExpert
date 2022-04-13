package com.psh.algoexpert.dp;
import java.lang.reflect.Array;
import java.util.*;
public class LongestStringChain {
    static int maxCount = 0;
    static ArrayList<String> result = null;
    public static List<String> longestStringChain(List<String> strings) {

        maxCount = 0;
        result = null;

        var allStrs = new HashMap<Integer, ArrayList<String> >();
        var myMap = new HashMap<String, ArrayList<String>>();

        //size  by strings
        for (String str : strings) {
            int key = str.length();
            if(allStrs.containsKey(key)) {
                allStrs.get(key).add(str);
            } else {
                var arrList = new ArrayList<String>();
                arrList.add(str);
                allStrs.put(key, arrList);
            }
        }

        // build map
        for (String str : strings) {
            var targets = allStrs.get(str.length()+1);
            if(targets != null) {
                for (String target : targets) {
                    if(isChain(str, target)) {
                        if(myMap.containsKey(str)){
                            myMap.get(str).add(target);
                        } else {
                            var temp = new ArrayList<String>();
                            temp.add(target);
                            myMap.put(str, temp);
                        }
                    }
                }
            }
        }

        // get longest
        var tempResult = new ArrayList<String>();
        for (String str : strings) {
            tempResult.clear();
            tempResult.add(str);
            findChain(str, myMap, tempResult);
        }
        if(result == null)
            result = new ArrayList<String>();
        if(result.size() > 0) {
            result.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length() > o2.length()) {
                        return -1;
                    }
                    return 1;
                }
            });
        }
        return result;
    }

    public static void findChain(String str, HashMap<String,
            ArrayList<String>> myMap, ArrayList<String> rr) {
        var cands = myMap.get(str);
        if(cands != null) {
            for (int i = 0; i < cands.size(); i++) {
                String cand = cands.get(i);
                rr.add(cand);
                if(maxCount <  rr.size()) {
                    maxCount = rr.size();
                    result = (ArrayList<String>) rr.clone();
                }
                findChain(cand, myMap, rr);
                rr.remove(rr.size()-1);
            }
        }
    }

    public static boolean isChain(String str, String str2) {
        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        int lastIndex = -1;
        boolean isFound = false;
        for (int i = 0; i < arr1.length; i++) {
            char c = arr1[i];
            isFound = false;
            for (int j = 0; j < arr2.length; j++) {
                char t = arr2[j];
                if(lastIndex < j && c == t) {
                    lastIndex = j;
                    isFound = true;
                    break;
                }
            }
            if(!isFound)
                return false;
        }
        return true;
    }
}
