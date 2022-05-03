package com.psh.algoexpert.searching;

import java.util.*;

public class SearchForRange {
    public static int[] searchForRange(int[] array, int target) {
        var result = new ArrayList<Integer>();
        search(array, target, 0, array.length - 1, result);
        if (result.size() > 1) {
            result.sort(Comparator.naturalOrder());
            return new int[]{result.get(0), result.get(result.size() - 1)};
        } else if (result.size() == 1) {
            return new int[]{result.get(0), result.get(0)};
        }
        return new int[]{-1, -1};
    }

    public static void search(int[] src, int target, int left, int right, ArrayList<Integer> result) {
        if (left == right) {
            if (src[left] == target) result.add(left);
            return;
        } else if (left + 1 == right) {
            if (src[left] == target) result.add(left);
            if (src[right] == target) result.add(right);
            return;
        }

        int m = (left + right) / 2;
        if (src[m] == target)  result.add(m);
        if(target<=src[m])
            search(src, target, left, m - 1, result);
        if(src[m]<=target)
            search(src, target, m + 1, right, result);
    }
}
