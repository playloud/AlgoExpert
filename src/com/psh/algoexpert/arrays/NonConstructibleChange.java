package com.psh.algoexpert.arrays;

import java.util.*;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {

        if(coins == null || coins.length == 0) return 1;
        // if there is one coin
        if(coins.length == 1) {
            int coin = coins[0];
            if(coin == 1) return 2;
            else return 1;
        }


        var myset = new HashSet<Integer>();
        var changes = new ArrayList<Integer>();

        coins =  Arrays.stream(coins).sorted().toArray();
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            if(i==0) {
                myset.add(coin);
                changes.add(coin);
            } else {
                int changesLength = changes.size();
                for (int j = 0; j < changesLength; j++) {
                    int rec = changes.get(j);
                    int possible = rec + coin;
                    if(!myset.contains(possible)) {
                        myset.add(possible);
                        changes.add(possible);
                    }
                }
                if(!myset.contains(coin)) {
                    myset.add(coin);
                    changes.add(coin);
                    changes.sort(Comparator.naturalOrder());
                }

                // check change
                for (int j = 0; j < changes.size()-1; j++) {
                    int one = changes.get(j);
                    int two = changes.get(j+1);
                    if((two-one) != 1) {
                        return one+1;
                    }
                }
            }
        }

        // check change
        for (int j = 0; j < changes.size()-1; j++) {
            int one = changes.get(j);
            int two = changes.get(j+1);
            if((two-one) != 1) {
                return one+1;
            }
        }
        return changes.get(changes.size()-1) +1;
    }
}
