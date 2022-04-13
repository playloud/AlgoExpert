//https://www.algoexpert.io/questions/Merge%20Overlapping%20Intervals
// PSH 01/17/22 :
package com.psh.algoexpert.arrays;

import java.util.ArrayList;

public class MergeOverlappingIntervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        ArrayList<Interval> myIntervals = new ArrayList<>();
        // build my interval
        for (int i = 0; i < intervals.length; i++) {
            var ss = new Interval();
            ss.start = intervals[i][0];
            ss.end = intervals[i][1];
            myIntervals.add(ss);
        }

        // analyze intervals then find overlap
        boolean isFoundMerge = true;
        while(myIntervals.size() > 1) {
            isFoundMerge = false;
            outer: for (int i = 0; i < myIntervals.size(); i++) {
                for (int j = i; j < myIntervals.size(); j++) {
                    var intv1 = myIntervals.get(i);
                    var intv2 = myIntervals.get(j);
                    if(intv1 == intv2) continue ;

                    if(intv1.isOverlapped(intv2)) {
                        intv1 = myIntervals.remove(i);
                        intv2 = myIntervals.remove(j-1);  // important!! it is not j
                        Interval merged = intv1.merge(intv2);
                        myIntervals.add(merged);
                        isFoundMerge = true;
                        break outer;
                    }
                }
            }

            if(!isFoundMerge) break;
            if(myIntervals.size() == 1) break;
        }

        // re calculate intervals
        int[][] result = new int[myIntervals.size()][];

        for (int i = 0; i < myIntervals.size(); i++) {
            result[i] = new int[2];
            var cur = myIntervals.get(i);
            result[i][0] = cur.start;
            result[i][1] = cur.end;
        }


        // Write your code here.
        return result;
    }

    class Interval {
        int start = 0;
        int end = 0;

        public boolean isOverlapped(Interval intv) {

            if( intv.start <= this.start && this.start <= intv.end) {
                return true;
            }

            if( intv.start <= this.end && this.end <= intv.end) {
                return true;
            }

            return false;
        }

        public Interval merge(Interval intv) {
            Interval merged = new Interval();
            merged.start = Math.min(this.start, intv.start);
            merged.end = Math.max(this.end, intv.end);
            return merged;
        }
    }
}
