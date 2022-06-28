package com.psh.leetcode.weelyContest;

import java.sql.Array;
import java.util.*;

public class Contest298 {

    //https://leetcode.com/contest/weekly-contest-298/problems/sum-of-numbers-with-units-digit-k/
    // PSH 06/19/22 : failed
    int minCount = 0;

    public int minimumNumbers(int num, int k) {
        minCount = Integer.MAX_VALUE;

        if (num == 0) return 0;

        var history = new ArrayList<Integer>();
        search2(k, num, history);

        if (minCount == Integer.MAX_VALUE) return -1;
        return minCount;
    }

    public void search2(int k, int num, ArrayList<Integer> history) {
        //System.out.println(String.format("%d %d", num, k));
        if (num < k) return;
        if (minCount <= history.size()) return;
        int startI = (num - k) / 10;
        for (int i = startI; i >= 0; i--) {

            int curNum = i * 10 + k;
            if (num < curNum || curNum < 0) {
                break;
            } else {
                int remain = num - curNum;
                if (remain == 0) {
                    history.add(curNum);
                    if (minCount <= history.size())
                        return;
                    // found it
                    minCount = Math.min(minCount, history.size());
                    //System.out.println(String.format("%d %d", num, curNum));
                    System.out.println(history);
                    //System.out.println(minCount+ "<<"+history.size());
                    history.remove(history.size() - 1);
                } else if (remain == num) {
                    return;
                } else if (remain > 0) {
                    history.add(curNum);
                    //recursion
                    search2(k, remain, history);
                    history.remove(history.size() - 1);
                }
            }
        }
    }

    public void search(int k, int num, ArrayList<Integer> history) {

        if (num < k) return;
        if (minCount <= history.size()) return;

        // seed number
        for (int i = 0; ; i++) {

            if (minCount <= history.size())
                return;

            int curNum = k + i * 10;
            if (num < curNum) {
                break;
            } else {
                int remain = num - curNum;
                if (remain == 0) {
                    history.add(curNum);
                    if (minCount <= history.size())
                        return;
                    // found it
                    minCount = Math.min(minCount, history.size());
                    //System.out.println(String.format("%d %d", num, curNum));
                    //System.out.println(history);
                    System.out.println(minCount + "<<" + history.size());
                    history.remove(history.size() - 1);
                } else if (remain > 0) {
                    history.add(curNum);
                    //recursion
                    search(k, remain, history);
                    history.remove(history.size() - 1);
                }
            }
        }

    }


    //https://leetcode.com/contest/weekly-contest-298/problems/greatest-english-letter-in-upper-and-lower-case/
    public String greatestLetter(String s) {

        char[] arr = s.toCharArray();
        var myPq = new PriorityQueue<Character>(Comparator.reverseOrder());
        var set = new HashSet<>();

        for (char c : arr) {
            set.add(c);

            if (Character.isLowerCase(c)) {
                if (set.contains(Character.toUpperCase(c))) {
                    myPq.add(Character.toUpperCase(c));
                }
            } else {
                if (set.contains(Character.toLowerCase(c))) {
                    myPq.add(c);
                }
            }
        }

        if (myPq.size() > 0)
            return myPq.peek() + "";

        return "";
    }


}
