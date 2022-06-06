package com.psh.leetcode.amazon;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MaximumLengthofSubarrayWithPositiveProduct {
    int maxLen = 0;
    public int getMaxLen(int[] nums) {
        maxLen = 0;
        var zeroIndice = new ArrayList<Integer>();
        var minIndice = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if(cur == 0) zeroIndice.add(i);
            if(cur < 0) minIndice.add(i);
        }

        if(zeroIndice.size() > 0) {
            int si = 0, ei = 0;
            for (int i = 0; i < zeroIndice.size(); i++) {
                int curZeroIndex = zeroIndice.get(i);
                ei = curZeroIndex-1;
                // now check si to ei
                search(si, ei, minIndice, nums);
                si = curZeroIndex+1;
            }
            ei = nums.length-1;
            // check again si to ei
            search(si, ei, minIndice, nums);

        } else {
            search(0, nums.length-1, minIndice, nums);
        }

        return maxLen;
    }

    public void search(int si, int ei, ArrayList<Integer> minIndice, int[] nums) {

        if(maxLen > (ei-si+1))
            return;

        var mins = minIndice.stream().filter(a->si<=a && a<=ei).collect(Collectors.toList());
        if(mins.size() == 0) {
            maxLen = Math.max(maxLen, (ei-si+1));
        } else {
            if(mins.size() % 2 == 0) {
                maxLen = Math.max(maxLen, (ei-si+1));
            } else if(mins.size() == 1) {
                int m = mins.get(0);
                //divide into two parts

                //lower part
                maxLen = Math.max(maxLen, ((m-1)-si+1));

                //high part
                maxLen = Math.max(maxLen, (ei-(m+1)+1));
            } else {
                // now there are three more mins, search two parts
                // two pairs
                //pair 1
                int si_1 = mins.get(0), ei_1 = mins.get(mins.size()-2);
                searchExpand(si_1, ei_1, si, ei, nums);

                //pair 2
                int si_2 = mins.get(1), ei_2 = mins.get(mins.size()-1);
                searchExpand(si_2, ei_2, si, ei, nums);
            }
        }
    }

    public void searchExpand(int si, int ei, int lowerBound, int maxBound, int[] nums) {
        //start go left
        while(true) {
            if( (si-1) < lowerBound || nums[si-1] <= 0) break;
            --si;
        }
        //end go right
        while(true) {
            if( (ei+1) > maxBound || nums[ei+1] <= 0) break;
            ++ei;
        }
        maxLen = Math.max(maxLen, (ei-(si)+1));
    }
}
