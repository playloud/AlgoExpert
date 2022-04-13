package com.psh.algoexpert.dp;
import java.util.*;
public class DiskStacking {
    static int maxHeight = 0;
    static boolean[] maxPath = null;
    public static List<Integer[]> diskStacking(List<Integer[]> disks) {

        disks.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[2] < o2[2]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        var result = new ArrayList<Integer[]>();
        maxHeight = 0;
        boolean[] map = new boolean[disks.size()];
        for (int i = 0; i < disks.size(); i++) {
            map[i] = true;
            mySol(i, map, disks, 0);
            map[i] = false;
        }

        for (int i = 0; i < maxPath.length; i++) {
            if(maxPath[i]) {
                result.add(disks.get(i));
            }
        }

        // Write your code here.
        return result;
    }

    public static void mySol(int si, boolean[] map, List<Integer[]> disks, int curMax) {
        var cur = disks.get(si);

        if(maxHeight < (curMax + cur[2])) {
            maxHeight = curMax + cur[2];
            maxPath = map.clone();
            System.out.println(maxHeight);
            System.out.println(Arrays.toString(maxPath));
            System.out.println();
        }

        if(si +1 <= disks.size()-1) {
            for (int i = si+1; i < disks.size(); i++) {
                var next = disks.get(i);
                if(cur[0] < next[0] && cur[1] < next[1] && cur[2] < next[2] ) {
                    map[i] = true;
                    mySol(i, map, disks, (curMax+cur[2]));
                    map[i] = false;
                }
            }
        }
    }
}
