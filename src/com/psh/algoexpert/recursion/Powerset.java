package com.psh.algoexpert.recursion;

import java.util.*;

public class Powerset {

    public static List<List<Integer>> powerset(List<Integer> array) {

        boolean[] map = new boolean[array.size()];
        var buf = new ArrayList<Integer>();
        var result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        myPSet(array, -1, map, buf, result);

        //System.out.println(result);
        return result;
    }

    public static void myPSet(List<Integer> array, int startIndex,boolean[] map, ArrayList<Integer> buf, ArrayList<List<Integer>> result) {
        if(buf.size() == array.size() ) return;

        for (int i = startIndex+1; i < array.size(); i++) {
            if(!map[i]) {
                map[i] = true;
                buf.add(array.get(i));
                //System.out.println(buf);
                var cloned = buf.clone();
                result.add((ArrayList<Integer>)cloned);
                myPSet(array, i, map, buf, result);
                map[i] = false;
                buf.remove(buf.size()-1);
            }
        }
    }
}
