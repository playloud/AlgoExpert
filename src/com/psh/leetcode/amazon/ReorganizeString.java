package com.psh.leetcode.amazon;

import java.util.*;
//https://leetcode.com/problems/reorganize-string/
// one shot successful
public class ReorganizeString {
    public String reorganizeString(String s) {

        char[] src = s.toCharArray();
        var myMap = new HashMap<Character, ChCnt>();
        var pq = new PriorityQueue<ChCnt>();
        StringBuffer sbuf = new StringBuffer();

        for (char c : src) {
            if (!myMap.containsKey(c)) {
                myMap.put(c, new ChCnt(c, 1));
            } else {
                myMap.get(c).count++;
            }
        }

        //build pq
        for (Character c : myMap.keySet()) {
            pq.add(myMap.get(c));
        }

        while (pq.size() > 0) {
            var cur = pq.remove();
            if (sbuf.length() == 0) {
                sbuf.append(cur.c);
                cur.count --;
                if(cur.count > 0) {
                    pq.add(cur);
                }
            } else {
                if(sbuf.charAt(sbuf.length()-1) != cur.c) {
                    sbuf.append(cur.c);
                    cur.count --;
                    if(cur.count > 0) {
                        pq.add(cur);
                    }
                } else {
                    if(pq.size() == 0) return "";

                    var cur2 = pq.remove();
                    sbuf.append(cur2.c);
                    cur2.count--;
                    if(cur.count > 0) {
                        pq.add(cur);
                    }
                    if(cur2.count > 0) {
                        pq.add(cur2);
                    }
                }
            }
        }

        return sbuf.toString();
    }

    class ChCnt implements Comparable<ChCnt> {

        char c;
        int count = 0;

        public ChCnt(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(ChCnt o) {
            if(this.count < o.count) return 1;
            else if(this.count == o.count) return 0;
            return -1;
        }
    }
}
