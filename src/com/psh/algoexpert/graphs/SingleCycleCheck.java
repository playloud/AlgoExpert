//https://www.algoexpert.io/questions/Single%20Cycle%20Check
// PSH 01/24/22 : calculation of next int is important
package com.psh.algoexpert.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SingleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {

        if(array == null || array.length ==0 ) return false;

        var curIndex = 0;

        var myQueue = new LinkedList<Integer>();
        var visited = new HashSet<Integer>();
        myQueue.add(curIndex);
        visited.add(curIndex);
        for (int i = 0; i < array.length; i++) {
            int nextIndex = 0;
            int value = array[curIndex];
            nextIndex = curIndex + value;
            if(nextIndex >= array.length) {
                nextIndex = nextIndex % array.length;
            } else if (nextIndex < 0) {
                nextIndex = array.length - (Math.abs(nextIndex) % array.length);
                if(nextIndex == array.length)
                    nextIndex = 0;
            }
            curIndex = nextIndex;

            if( i < array.length-1 && visited.contains(curIndex))
                return false;
            else {
                visited.add(curIndex);
            }
            if(i == array.length-1) {
                if(curIndex != 0) return false;
            }
        }


        return true;
    }
}
