package com.psh.algoexpert.greedy;

import java.util.ArrayList;
import java.util.Comparator;

public class ValidStartingCity {

    public int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        var perfArr = new ArrayList<Perf>();
        for (int i = 0; i < distances.length; i++) {
            int value = mpg * fuel[i] - distances[i];
            System.out.println(i+" =>"+value);
            perfArr.add(new Perf(i, value));
        }
        var original = (ArrayList<Perf>)perfArr.clone();

        // reverse order
        perfArr.sort(new Comparator<Perf>() {
            @Override
            public int compare(Perf p1, Perf p2) {
                if(p1.value < p2.value)
                    return 1;
                return -1;
            }
        });

        var lastIndiceCandidate = new ArrayList<Integer>();

        for (int i = 0; i < original.size(); i++) {
            int startIndex = perfArr.get(i).index;
            int cumulativeValue = 0;
            for (int j = startIndex; j < original.size()*2; j++) {
                int index = j % original.size();
                cumulativeValue += original.get(index).value;

                if(cumulativeValue < 0) break;

                if(startIndex == index && j >= original.size()) {
                    if(cumulativeValue >= 0) {
                        //return startIndex;
                        //int result =  startIndex;
                        lastIndiceCandidate.add(startIndex);
                    }
                }
            }
        }
        lastIndiceCandidate.sort(Comparator.naturalOrder());
        return lastIndiceCandidate.get(0);
    }

    public class Perf {
        int index;
        int value;
        public Perf(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
