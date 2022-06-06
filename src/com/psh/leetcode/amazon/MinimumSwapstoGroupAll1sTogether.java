package com.psh.leetcode.amazon;
//https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/
// KEY : sliding windows, zero count, window size: count of 1
public class MinimumSwapstoGroupAll1sTogether {

    public int minSwaps(int[] data) {
        int min = Integer.MAX_VALUE;
        int oneCount = 0, zeroCount = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == 1) oneCount++;
            else zeroCount++;
        }

        if(oneCount == 1 || oneCount == 0) return 0;

        int left = 0, right = oneCount-1;
        boolean init = true;
        int myZeroCount = 0;

        while(right < data.length-1) {
            if(init) {
                // get zero count
                for (int i = 0; i <= right; i++) {
                    if(data[i] == 0)
                        ++myZeroCount;
                }
                System.out.println(myZeroCount+":init");
                min = Math.min(min, myZeroCount);
                init = false;
            } else {
                // calculate zero count
                int toDelete = data[left];
                int toAdd = data[++right];

                if(toDelete == 0) myZeroCount--;
                if(toAdd == 0) myZeroCount++;

                System.out.println(String.format("[%d-%d] %d", (left+1),right, myZeroCount));

                min = Math.min(min, myZeroCount);
                ++left;
            }
        }
        return min;
    }
}
