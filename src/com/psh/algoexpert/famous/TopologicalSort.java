package com.psh.algoexpert.famous;
import java.util.*;
public class TopologicalSort {
    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        List<Integer> result = new ArrayList<Integer>();
        var myDeps = new HashMap<Integer, HashSet<Integer>>();
        var jobsNeedme = new HashMap<Integer, HashSet<Integer>>();

        // build jobs and dependents
        for (Integer job : jobs) {
            myDeps.put(job, new HashSet<Integer>());
            jobsNeedme.put(job, new HashSet<Integer>());
        }
        for (Integer[] dep : deps) {
            int pre = dep[0];
            int me = dep[1];

            myDeps.get(me).add(pre);
            jobsNeedme.get(pre).add(me);
        }

        boolean noDpendFound = false;
        while(true) {
            if(myDeps.isEmpty()) break;
            noDpendFound = false;
            for (Integer job : jobs) {
                if(myDeps.containsKey(job) && myDeps.get(job).size() == 0) {
                    noDpendFound = true;
                    result.add(job);
                    myDeps.remove(job);

                    var allDepends = jobsNeedme.get(job);
                    if(allDepends != null) {
                        for (Integer depend : allDepends) {
                            myDeps.get(depend).remove(job);
                        }
                        jobsNeedme.remove(job);
                    }
                }
            }

            if(jobsNeedme.isEmpty()) break;
            if(!noDpendFound) break;
        }

        if(!noDpendFound ) {
            //dead lock
            return new ArrayList<Integer>();
        }

        return result;
    }
}
