package com.psh.leetcode;
//Runtime: 225 ms, faster than 5.33% of Java online submissions for Strobogrammatic Number II.
//Memory Usage: 125.1 MB, less than 7.62% of Java online submissions for Strobogrammatic Number II.
import java.util.*;
public class StrobogrammaticNumberII {
    public List<String> findStrobogrammatic(int n) {

        var result = new ArrayList<String>();
        var tempResult = new ArrayList<Character>();
        char[] allNums = {'0','1','6','8','9'};

        if(n == 1) {
            result.add("0");
            result.add("1");
            result.add("8");
            return result;
        }
        search(0, n, tempResult, allNums, result);

        return result;
    }

    public void search(int ci, int n, List<Character> tempResult, char[] allNums, List<String> finalResult) {

        if(tempResult.size() == n) {
            var buf = new StringBuffer();
            tempResult.forEach(a->{
                buf.append(a);
            });
            finalResult.add(buf.toString());
            return;
        }

        for (int i = 0; i < allNums.length; i++) {

            char c = allNums[i];

            if(ci == 0 && c == '0') continue;

            int pair = n - ci - 1;

            if(pair == ci) {
                // odd center
                if(c == '6' || c == '9') continue;
                tempResult.add(c);
                search(ci+1, n, tempResult, allNums, finalResult);
                tempResult.remove(tempResult.size()-1);
            } else if(pair >= 0 && pair < ci) {
                //System.out.println(String.format("%d %d", ci, pair));
                if(tempResult.get(pair) == '6'){
                    // must 9
                    if(c != '9') continue;
                } else if(tempResult.get(pair) == '9') {
                    // must 6
                    if(c != '6') continue;
                } else {
                    if(c != tempResult.get(pair)) continue;
                }
                tempResult.add(c);
                search(ci+1, n, tempResult, allNums, finalResult);
                tempResult.remove(tempResult.size()-1);
            } else {
                tempResult.add(c);
                search(ci+1, n, tempResult, allNums, finalResult);
                tempResult.remove(tempResult.size()-1);
            }

        }

    }
}
