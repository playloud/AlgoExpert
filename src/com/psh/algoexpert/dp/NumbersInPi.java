package com.psh.algoexpert.dp;
import java.util.*;

public class NumbersInPi {
    static int minCount = 0;
    public static int numbersInPi(String pi, String[] numbers) {
        minCount = Integer.MAX_VALUE;

        var indexMap = new HashMap<Integer, ArrayList<Integer>>();
        // index: size
        for (String num : numbers) {
            var indice = getAllOccurs(num, pi);
            if(indice == null) continue;
            else {
                for (Integer index : indice) {
                    ArrayList<Integer> list = null;
                    if(!indexMap.containsKey(index)) {
                        list = new ArrayList<>();
                    } else {
                        list = indexMap.get(index);
                    }
                    list.add(num.length());
                    indexMap.put(index, list);
                }
            }
        }
        mySol(indexMap, 0, 0, pi.length());
        if(minCount==Integer.MAX_VALUE)
            return -1;
        return minCount-1;
    }

    public static void mySol(HashMap<Integer, ArrayList<Integer>> indexMap, int curIndex, int elementSize, int maxSize) {
        if(curIndex == maxSize) {
            if(elementSize < minCount)
                minCount = elementSize;
            return;
        }
        if(indexMap.containsKey(curIndex)) {
            for (Integer size : indexMap.get(curIndex)) {
                mySol(indexMap, (curIndex+size), (elementSize+1), maxSize);
            }
        }
    }

    public static ArrayList<Integer> getAllOccurs(String part, String src) {
        var result = new ArrayList<Integer>();
        int index = -1;
        while(true) {
            index = src.indexOf(part, index+1);
            if(index == -1) break;
            else {
                result.add(index);
            }
        }
        if(result.size()>0) return result;
        return null;
    }


}
