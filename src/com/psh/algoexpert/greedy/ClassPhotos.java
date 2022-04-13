package com.psh.algoexpert.greedy;

import java.util.*;

public class ClassPhotos {

    public boolean classPhotos( ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        redShirtHeights.sort(Comparator.naturalOrder());
        blueShirtHeights.sort(Comparator.naturalOrder());
        var smaller = redShirtHeights.get(0) < blueShirtHeights.get(0)? redShirtHeights: blueShirtHeights;
        var bigger = redShirtHeights.get(0) < blueShirtHeights.get(0)? blueShirtHeights: redShirtHeights;

        for (int i = 0; i < smaller.size(); i++) {
            if(smaller.get(i) >= bigger.get(i))
                return false;
        }

        return true;
    }
}
