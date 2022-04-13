package com.psh.algoexpert.arrays;
import java.util.*;
public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        var result = new ArrayList<Integer[]>();
        boolean[] map = new boolean[array.length];
        var midResult = new ArrayList<ArrayList<Integer>>();
        fourNumSum(array, targetSum, map, midResult);

        for (ArrayList<Integer> parts : midResult) {
            Integer[] temp = new Integer[parts.size()];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = parts.get(i);
            }
            result.add(temp);
        }

        return result;
    }
    public static void fourNumSum(int[] arr, int target, boolean[] map, ArrayList<ArrayList<Integer>> results) {
        for (int i = 0; i < arr.length; i++) {
            var localResult = new ArrayList<ArrayList<Integer>>();
            int value = arr[i];
            int subTarget = target - value;
            map[i] = true;
            threeNumSum(arr, i+1, subTarget, map, localResult);
            if(localResult.size() > 0) {
                for (ArrayList<Integer> integers : localResult) {
                    if(integers.size() == 3) {
                        ArrayList<Integer> clone = (ArrayList<Integer>) integers.clone();
                        clone.add(0, value);
                        results.add(clone);
                    }
                }
            }
            map[i] = false;
        }
    }
    public static void threeNumSum(int[] arr, int startIndex, int target, boolean[] map, ArrayList<ArrayList<Integer>> results) {
        for (int i = startIndex; i < arr.length; i++) {
            if(!map[i]) {
                var localResult = new ArrayList<ArrayList<Integer>>();
                int value = arr[i];
                int subTarget = target - value;
                map[i] = true;
                twoNumSum(arr, i+1, subTarget, map, localResult);
                if(localResult.size() > 0) {
                    for (ArrayList<Integer> integers : localResult) {
                        if (integers.size() == 2) {
                            ArrayList<Integer> clone = (ArrayList<Integer>) integers.clone();
                            clone.add(0, value);
                            results.add(clone);
                        }
                    }
                }
                results.addAll(localResult);
                map[i] = false;
            }
        }
    }
    public static void twoNumSum(int[] arr, int startIndex, int target, boolean[] map, ArrayList<ArrayList<Integer>> results) {
        for (int i = startIndex; i < arr.length; i++) {
            if(!map[i]) {
                var localResult = new ArrayList<Integer>();
                int value = arr[i];
                int subTarget = target - value;
                map[i] = true;
                for (int j = i+1; j < arr.length; j++) {
                    if(!map[j] && subTarget == arr[j]) {
                        localResult.add(value);
                        localResult.add(arr[j]);
                        results.add(localResult);
                    }
                }
                map[i] = false;
            }
        }
    }

}
