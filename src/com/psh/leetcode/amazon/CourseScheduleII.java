package com.psh.leetcode.amazon;
import java.util.*;
import java.util.stream.Stream;

public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        var result = new ArrayList<Integer>();
        // kid : parents
        var myParents = new HashMap<Integer, HashSet<Integer>>();
        // parent : kids
        var myKids = new HashMap<Integer, HashSet<Integer>>();
        var noKids = new HashSet<Integer>();
        var allCourses = new HashSet<Integer>();
        for (int i = 0; i < numCourses; i++) allCourses.add(i);

        // build
        for (int i = 0; i < prerequisites.length; i++) {
            int parent = prerequisites[i][0];
            int kid = prerequisites[i][1];

            if(!myParents.containsKey(kid))
                myParents.put(kid, new HashSet<>());

            if(!myParents.containsKey(parent))
                myParents.put(parent, new HashSet<>());

            myParents.get(kid).add(parent);

            if(!myKids.containsKey(parent))
                myKids.put(parent, new HashSet<>());

            if(!myKids.containsKey(kid))
                myKids.put(kid, new HashSet<>());

            myKids.get(parent).add(kid);

            if(allCourses.contains(kid)) allCourses.remove(kid);
            if(allCourses.contains(parent)) allCourses.remove(parent);
        }

        for (Integer parent : myKids.keySet()) {
            if(myKids.get(parent).size() == 0)
                noKids.add(parent);
        }
        for (Integer cource : allCourses)  noKids.add(cource);

        while(noKids.size() > 0) {
            int kid = 0;
            for (Integer noKid : noKids) {
                kid = noKid;
                break;
            }
            result.add(kid);
            if(myParents.containsKey(kid)) {
                for (Integer parent : myParents.get(kid)) {
                    myKids.get(parent).remove(kid);
                    if(myKids.get(parent).size() == 0){
                        noKids.add(parent);
                    }
                }
            }
            myParents.remove(kid);
            noKids.remove(kid);
        }

        if(result.size() == 0 && numCourses > 0 && prerequisites.length == 0) {
            for (int i = 0; i < numCourses; i++) {
                result.add(i);
            }
        } else if(result.size() != numCourses) {
            return (new int[0]);
        }
        int[] _result = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            _result[i] = result.get(i);
        } // what could be the best way??
        return _result;
    }
}