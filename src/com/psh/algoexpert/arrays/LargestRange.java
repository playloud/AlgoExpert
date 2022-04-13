package com.psh.algoexpert.arrays;
import java.util.*;
public class LargestRange {

    public static int[] largestRange(int[] array) {
        var result = new int[2];
        if(array == null)
            return null;

        if(array.length < 2) {
            result[0] = array[0];
            result[1] = array[0];
            return result;
        }
        Arrays.sort(array);

        LRng curRange = null;
        var myRanges = new ArrayList<LRng>();

        for (int i = 0; i < array.length-1; i++) {
            int cur = array[i];
            int next = array[i+1];
            if(next-cur == 1 || next-cur==0) {
                if(curRange == null) {
                    curRange = new LRng();
                    curRange.startValue = cur;
                }

                if(curRange != null && i == array.length-2) {
                    curRange.endValue = next;
                    myRanges.add(curRange);
                    curRange = null;
                }

            } else {
                if(curRange != null) {
                    curRange.endValue = cur;
                    myRanges.add(curRange);
                    curRange = null;
                }
            }
        }

        myRanges.sort(new Comparator<LRng>() {
            @Override
            public int compare(LRng o1, LRng o2) {
                if(o1.getSize() < o2.getSize())
                    return 1;
                else
                    return -1;
            }
        });

        if(myRanges.size() >= 1) {
            result[0] = (myRanges.get(0).startValue);
            result[1] = (myRanges.get(0).endValue);
        }
        return result;
    }

    public static class LRng {
        int startValue;
        int endValue;
        public int getSize() {
            return (endValue-startValue);
        }
        @Override
        public String toString() {
            return "LRng{" +
                    "startValue=" + startValue +
                    ", endValue=" + endValue +
                    '}';
        }
    }

}
