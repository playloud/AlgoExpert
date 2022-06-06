package com.psh.leetcode.amazon;
//https://leetcode.com/problems/kill-process/
//one shot
import java.util.*;
public class KillProcess {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

        var cpMap = new HashMap<Integer, HashSet<Integer>>();
        for (int i = 0; i < pid.size(); i++) {
            int curPid = pid.get(i);
            int parent = ppid.get(i);

            if(!cpMap.containsKey(parent)) cpMap.put(parent, new HashSet<>());
            cpMap.get(parent).add(curPid);
        }

        var result = new ArrayList<Integer>();
        getChilds(cpMap, kill, result);
        return result;
    }

    public void getChilds(HashMap<Integer, HashSet<Integer>> cpmap, int parentId, ArrayList<Integer> results) {
        results.add(parentId);
        if(cpmap.containsKey(parentId)) {
            var set = cpmap.get(parentId);
            for (Integer childId : set) {
                getChilds(cpmap, childId, results);
            }
        }
    }
}
