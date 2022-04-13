package com.psh.algoexpert.graphs;
import java.util.*;
public class DetectArbitrage {
    static boolean finalResult = false;
    public boolean detectArbitrage(ArrayList<ArrayList<Double>> exchangeRates) {
        finalResult = false;
        var mySet = new HashSet<Integer>();
        var order = new ArrayList<Integer>();

        for (int i = 0; i < exchangeRates.size(); i++) {
            mySol(i, exchangeRates, mySet, order);
        }
        return finalResult;
    }

    public void mySol(int start, ArrayList<ArrayList<Double>> exRate, HashSet<Integer> history, ArrayList<Integer> order) {
        if(finalResult)
            return;
        int size = exRate.size();
        for (int i = 0; i < size; i++) {
            if(i == start) {
                order.add(i);
                boolean result = doCheckArbit(start, exRate, order);
                if(result)
                    finalResult = true;
                order.remove(order.size()-1);
            } else {
                if(!history.contains(i)) {
                    history.add(i);
                    order.add(i);
                    mySol(start, exRate, history, order);
                    history.remove(i);
                    //remove last item
                    order.remove(order.size()-1);
                }
            }
        }
    }

    public boolean doCheckArbit(int start, ArrayList<ArrayList<Double>> exRate, ArrayList<Integer> order) {
        double result = exRate.get(start).get(start);
        int lastIndex = start;
        for (int i = 0; i < order.size(); i++) {
            int curIndex = order.get(i);
            double value = exRate.get(lastIndex).get(curIndex);
            result = result * value;
            lastIndex = curIndex;
        }

        if(result > 1)
            return true;

        return false;
    }

}
