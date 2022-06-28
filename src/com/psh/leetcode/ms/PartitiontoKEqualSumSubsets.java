package com.psh.leetcode.ms;
//https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
// not working correctly
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class PartitiontoKEqualSumSubsets {

    // this is ridiculous, non sense
    public boolean canPartitionKSubsets(int[] nums, int k) {
        boolean result = true;

        int div = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        var arr = new ArrayList<Integer>();

        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
            arr.add(num);
        }

        div = sum / k;

        if(max > div) return false;
        if(sum % k > 0) return false;

        var temp = new ArrayList<Integer>();
        int tempSum = 0;
        arr.sort(Comparator.naturalOrder());
        while(arr.size() > 0) {
            temp.clear();
            tempSum = 0;
            while(tempSum < div) {
                if(tempSum == 0) {
                    int val = getMax(arr);
                    tempSum += val;
                    temp.add(val);
                } else {
                    // what I need?
                    int whatIneed = div - tempSum;
                    // if there is?
                    if(takeTarget(whatIneed, arr) == whatIneed) {
                        tempSum += whatIneed;
                        temp.add(whatIneed);
                    } else {
                        // no we dont have it
                        int min  = getMin(arr);
                        tempSum += min;
                        temp.add(min);
                    }
                }
                if(tempSum > div) return false;
                if(tempSum < div && arr.size() == 0) return false;
            }
            System.out.println(temp);
        }
        return result;

    }

    public int getMax(ArrayList<Integer> arr) {
        int last = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return last;
    }

    public int getMin(ArrayList<Integer> arr) {
        int first = arr.get(0);
        arr.remove(0);
        return first;
    }

    public int takeTarget(int target, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == target) {
                arr.remove(i);
                return target;
            }
        }
        return -1;
    }

}
