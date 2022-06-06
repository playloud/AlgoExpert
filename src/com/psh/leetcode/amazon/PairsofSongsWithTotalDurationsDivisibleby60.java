package com.psh.leetcode.amazon;

import java.util.*;

public class PairsofSongsWithTotalDurationsDivisibleby60 {

    int result = 0;
    public int numPairsDivisibleBy60(int[] time) {

        result = 0;
        var arrList = new ArrayList<TElem>();
        var myMap = new HashMap<Integer, ArrayList<TElem>>();

        for (int i = 0; i < time.length; i++) {
            int value = time[i];
            var obj = new TElem(i, value);
            arrList.add(obj);

            int key = value % 60;
            if (!myMap.containsKey(key))
                myMap.put(key, new ArrayList<TElem>());
            myMap.get(key).add(obj);
        }

        for (int i = 0; i < time.length; i++) {
            var cur = arrList.get(i);
            int keyNeeds = 60 - (cur.value % 60);
            if (keyNeeds == 60) keyNeeds = 0;
            if (myMap.containsKey(keyNeeds)) {
                //result += myMap.get(keyNeeds).stream().filter(a -> a.index > cur.index).count();
                result += getCountGreaterThan(myMap.get(keyNeeds), cur.index);
            }
        }
        return result;
    }

    int foundMinIndex = 0;

    public int getCountGreaterThan(ArrayList<TElem> arr, int target) {
        int count = 0;
        foundMinIndex = -1;
        int totalSize = arr.size();
        find(0, arr.size() - 1, arr, target);
        count = totalSize - foundMinIndex;
        return count;
    }

    public void find(int min, int max, ArrayList<TElem> arr, int target) {

        // when it goes final steps
        if ((min + 1 == max) || (min == max)) {
            if (target == arr.get(min).index) foundMinIndex = min + 1;
            else if (target < arr.get(min).index) foundMinIndex = min;
            else {
                if (target == arr.get(max).index) foundMinIndex = max + 1;
                else if (target < arr.get(max).index) foundMinIndex = max;
                else foundMinIndex = max + 1;
            }
            return;
        }

        int mid = (min + max) / 2;
        if (target == arr.get(mid).index) {
            foundMinIndex = mid + 1;
        } else if (target < arr.get(mid).index) {
            find(min, mid, arr, target);
        } else {
            find(mid, max, arr, target);
        }
    }


    class TElem {
        int index;
        int value;

        public TElem(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
