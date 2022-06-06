package com.psh.leetcode.weelyContest;

import java.util.ArrayList;
import java.util.HashMap;

public class Contest296 {

    int result01 = 0;
    public int minMaxGame(int[] nums) {
        result01 = 0;
        getMM(nums);
        return result01;
    }

    public void getMM(int[] nums) {
        var arr = new ArrayList<Integer>();
        boolean isMin = true;
        for (int i = 0; i < nums.length; ) {

            if(i == nums.length-1) {
                arr.add(nums[i]);
                break;
            }

            if(isMin) {
                arr.add(Math.min(nums[i], nums[i+1]));
            } else {
                arr.add(Math.max(nums[i], nums[i+1]));
            }
            i+=2;
            isMin = !isMin;
        }

        int[] midResult = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            midResult[i] = arr.get(i);
        }

        if(midResult.length > 1) {
            getMM(midResult);
        } else {
            result01 = arr.get(0);
        }

    }



    public int partitionArray(int[] nums, int k) {
        return 0;
    }

    public int[] arrayChange(int[] nums, int[][] operations) {
        // num: index
        var myMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            myMap.put(num, i);
        }

        for (int i = 0; i < operations.length; i++) {
            int[] op = operations[i];
            int fromNum = op[0];
            int toNum = op[1];
            int indexOf = myMap.get(fromNum);
            nums[indexOf] = toNum;
            myMap.remove(fromNum);
            myMap.put(toNum, indexOf);
        }


        return nums;
    }



}
