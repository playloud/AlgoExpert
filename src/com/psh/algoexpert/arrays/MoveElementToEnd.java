package com.psh.algoexpert.arrays;
import java.util.*;
public class MoveElementToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            int value = array.get(i);
            if(value == toMove) {
                count++;
            } else {
                if(count == 0) continue;
                int indexToMove = (i-count);
                array.remove(indexToMove);
                array.add(indexToMove, value);
                array.remove(i);
                array.add(i, toMove);
            }
        }
        return array;
    }

}
