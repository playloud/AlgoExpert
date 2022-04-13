package com.psh.algoexpert.dp;
import java.util.*;
public class PalindromePartitioningMinCuts {
    static int minFoundSize = Integer.MAX_VALUE;
    public static int palindromePartitioningMinCuts(String str) {
        minFoundSize = Integer.MAX_VALUE;
        var palns = new ArrayList<Paln>();
        if(str.length() == 1)
            return 0;

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                checkPaln(i, j, arr, palns);
            }
        }

        // add 1 size paln
        for (int i = 0; i < arr.length; i++) {
            palns.add(new Paln(i,i));
        }

        // check palns,
        palns.sort(new Comparator<Paln>() {
            @Override
            public int compare(Paln o1, Paln o2) {
                if(o1.start >= o2.start) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        // finding sets
        findSet(0, 0, str.length(), palns);
        if(minFoundSize != Integer.MAX_VALUE)
            return (minFoundSize-1);
        return -1;
    }
    public static void findSet(int startIndex, int prevCnt, int remainingSize, ArrayList<Paln> palns) {
        for (Paln paln : palns) {
            if(paln.start == startIndex) {
                int size = paln.end - paln.start + 1;
                if(remainingSize == size) {
                    // found it
                    int curCount = prevCnt + 1;
                    if( curCount< minFoundSize) {
                        minFoundSize = curCount;
                    }
                } else {
                    findSet(paln.end+1, (prevCnt + 1), (remainingSize - size), palns);
                }
            }
        }
    }
    public static void checkPaln(int i, int j, char[] arr, ArrayList<Paln> palns) {
        int start = i;
        int end = j;
        boolean isPalindron = true;
        while(start < end) {
            if(arr[start] != arr[end]) {
                isPalindron = false;
                break;
            }
            ++start;
            --end;
        }
        if(isPalindron) {
            palns.add(new Paln(i,j));
        }
    }
    public static class Paln {
        int start,end;
        public Paln(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
