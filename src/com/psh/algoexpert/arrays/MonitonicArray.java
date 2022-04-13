package com.psh.algoexpert.arrays;

public class MonitonicArray {

    enum flowState {None, Incresing, Descreasing};

    public static boolean isMonotonic(int[] array) {

        if(array == null || array.length == 0 ||  array.length == 1 || array.length ==2) return true;

        flowState curState = flowState.None;
        for (int i = 0; i < array.length-1; i++) {
            int a1 = array[i];
            int a2 = array[i+1];

            if(curState == flowState.None) {
                if (a1 == a2) return true;
                if(a1 < a2) curState = flowState.Incresing;
                if(a1 > a2) curState = flowState.Descreasing;
            } else if (curState == flowState.Incresing) {
                if(a1 > a2 || a1 == a2) return true;
            } else {
                if(a1 < a2 || a1 == a2) return true;
            }
        }
        return false;
    }
}
