//https://www.algoexpert.io/questions/Permutations
// PSH 01/23/22 : passed
package com.psh.algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> getPermutations(List<Integer> array) {

        var global = new ArrayList<List<Integer>>();
        permu(array, new ArrayList<Integer>(), new ArrayList<String>(), global);

        return global;
    }

    public static void permu(List<Integer> array, ArrayList<Integer> cur, ArrayList<String> occ, ArrayList<List<Integer>> global) {
        for (int i = 0; i < array.size(); i++) {
            if(!occ.contains(i+"")) {
                cur.add(array.get(i));
                occ.add(i+"");
                if(cur.size() == array.size()) {
                    global.add(cur);
                    break;
                }

                var nextCur = new ArrayList<Integer>();
                nextCur.addAll(cur);
                var nextOcc = new ArrayList<String>();
                nextOcc.addAll(occ);

                permu(array, nextCur, nextOcc, global);

                occ.remove(i+""); // remove last one
                cur.remove(cur.size()-1); // remove last index
            }
        }
    }



}
