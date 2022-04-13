package com.psh.algoexpert.stacks;

import java.util.*;

public class SunsetViews {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {

        int curValue = Integer.MIN_VALUE;
        var result = new ArrayList<Integer>();
        if(direction.equals("EAST") ) {
            for (int i = buildings.length -1 ; i >=0 ; i--) {
                if(curValue < buildings[i]) {
                    curValue = buildings[i];
                    result.add(i);
                }
            }
            //result.reverse();
            for (int i = 0; i < result.size(); i++) {
                int value = result.remove(result.size()-1);
                result.add(i, value);
            }
        } else {
            for (int i = 0 ; i < buildings.length ; i++) {
                if(curValue < buildings[i]) {
                    curValue = buildings[i];
                    result.add(i);
                }
            }
        }
        return result;
    }
}
