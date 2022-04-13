package com.psh.algoexpert.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TandemBicycle {

    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {

        List<Integer> reds = Arrays.stream(redShirtSpeeds).boxed().collect(Collectors.toList());
        List<Integer> blues = Arrays.stream(blueShirtSpeeds).boxed().collect(Collectors.toList());
        int sum = 0;
        if(fastest) {
            reds.sort(Comparator.reverseOrder());
            blues.sort(Comparator.naturalOrder());
        } else {
            reds.sort(Comparator.naturalOrder());
            blues.sort(Comparator.naturalOrder());
        }
        for (int i = 0; i < reds.size(); i++) {
            sum += Math.max(reds.get(i), blues.get(i));
        }
        return sum;
    }

}
