package com.psh.algoexpert.greedy;
import java.util.*;
public class TaskAssignment {
    public ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        var result = new ArrayList<ArrayList<Integer>>();
        var myTasks = new ArrayList<Task>();
        for (int i = 0; i < tasks.size(); i++) {
            myTasks.add(new Task(i, tasks.get(i)));
        }

        myTasks.sort(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                if(t1.size > t2.size)
                    return 1;
                else
                    return -1;
            }
        });

        for (int i = 0; i < myTasks.size()/2; i++) {
            var pair = new ArrayList<Integer>();
            var t1 = myTasks.get(i);
            var t2 = myTasks.get(myTasks.size()-1-i);
            pair.add(t1.index);;
            pair.add(t2.index);
            result.add(pair);
        }
        return result;
    }
    public class Task {
        public int size;
        public int index;
        public Task(int index, int size) {
            this.size = size;
            this.index = index;
        }
    }
}
