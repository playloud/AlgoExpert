package com.psh.leetcode;
import java.util.*;
public class LongestSubstringwithAtMostTwoDistinctCharacters {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = Integer.MIN_VALUE;
        char[] arr = s.toCharArray();

        int cursor = 0, ai=Integer.MAX_VALUE, bi=Integer.MAX_VALUE;
        Character a = null;
        Character b = null;

//        if(arr.length == 2) {
//            if(arr[0] != arr[1]) return 2;
//            else return 1;
//        } else if(arr.length == 1) {
//            return 1;
//        }

        while(cursor < arr.length) {

            if(a == null || b == null) {
                if(a == null) {
                    a = arr[cursor];
                    ai = cursor;
                } else if(b == null && arr[cursor] != a){
                    b = arr[cursor];
                    bi = cursor;
                }

                if(a != null && b != null) {
                    max = Math.max(max, cursor - Math.min(ai,bi)+1);
                }

            } else {
                if(arr[cursor] == a || arr[cursor] == b) {
//                    if(arr[cursor] == a) ai = cursor;
//                    if(arr[cursor] == b) bi = cursor;
                    max = Math.max(max, cursor - Math.min(ai,bi)+1);
                } else {

                    // need to found out last consecutive char
                    // ex) zazaZzbbbb...
                    // that lastZ should be the char a or char b
                    // search backward
                    char rightBeforec = arr[cursor-1];
                    int si = 0;
                    for (int i = cursor-1; i >=0 ; i--) {
                        if(arr[i] != rightBeforec){
                            si = i+1;
                            break;
                        }
                    }
                    if(a == rightBeforec) {
                        ai = si;
                        //dump b
                        b = arr[cursor];
                        bi = cursor;
                    } else {
                        bi = si;
                        //dimp a
                        a = arr[cursor];
                        ai = cursor;
                    }
                    max = Math.max(max, cursor - Math.min(ai,bi)+1);
                }
            }
            //redundant
            max = Math.max(max, cursor - Math.min(ai,bi)+1);
            cursor++;
        }

        return max;
    }

    public int lengthOfLongestSubstringTwoDistinct_(String s) {
        int max = Integer.MIN_VALUE;
        char[] arr = s.toCharArray();
        int si = 0, ei = 0, mi = 0;

        int count = 0;
        boolean isUpdated = false;

        if(arr.length == 2) {
            if(arr[0] != arr[1]) return 2;
        }

        while(true) {
            isUpdated = false;
            if(ei > 0 && arr[ei-1] != arr[ei]) {
                if(count == 1) {
                    System.out.println(String.format("%d %d", si, ei));
                    // update
                    max = Math.max(max, (ei-si));
                    si = mi;
                    count = 1;
                    isUpdated = true;
                } else {
                    count++;
                    mi = ei;
                }
            } else {
                max = Math.max(max, (ei-si));
                if(ei == arr.length-1) {
                    max = Math.max(max, (ei-si+1));
                }
            }

            ei++;
            if(ei==arr.length) break;

        }


        return max;
    }
}
