package com.psh.leetcode.citrix;
//https://leetcode.com/problems/maximum-performance-of-a-team/

import java.util.*;

public class MaximumPerformanceofaTeam {

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int result = 0;
        var arr = new ArrayList<Spefi>();
        for (int i = 0; i < speed.length; i++) {
            var spf = new Spefi(speed[i], efficiency[i]);
            arr.add(spf);
        }

        // sort by comparator
        arr.sort(new Comparator<Spefi>() {
            @Override
            public int compare(Spefi one, Spefi other) {
                if (other.effi > one.effi) return 1;
                else if (other.effi == one.effi) return 0;
                return -1;
            }
        });

        var pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int i = k - 1; i < arr.size(); i++) {
            pq.clear();
            var pivot = arr.get(i);
            pq.add(pivot.speed);
            for (int j = 0; j < i; j++) {
                var element = arr.get(j);
                pq.add(element.speed);
            }
            // now check the
            int tempSum = 0;
            for (int j = 0; j < k; j++) {
                tempSum += pq.remove();
            }
            int tempPerformance = (tempSum) * pivot.effi;
            result = Math.max(result, tempPerformance);
        }
        return result;
    }

    public int maxPerformance_wrong(int n, int[] speed, int[] efficiency, int k) {
        int result = 0;
        var arr = new ArrayList<Spefi>();
        for (int i = 0; i < speed.length; i++) {
            var spf = new Spefi(speed[i], efficiency[i]);
            arr.add(spf);
        }

        //both not working
        arr.sort(new Comparator<Spefi>() {
            //            @Override
//            public int compare(Spefi one, Spefi other) {
//                if (other.speed > one.speed) return 1;
//                else if (other.speed == one.speed) return 0;
//                return -1;
//            }
            @Override
            public int compare(Spefi one, Spefi other) {
                if (other.effi > one.effi) return 1;
                else if (other.effi == one.effi) return 0;
                return -1;
            }
        });

        var myWindow = new Window(k);

        //init window
        for (int i = 0; i < k; i++) {
            myWindow.addSpefi(arr.get(i));
        }
        result = Math.max(result, myWindow.getPerf());
        //now sliding window
        for (int i = k; i < n; i++) {
            var newSpefi = arr.get(i);
            myWindow.removeOne();
            myWindow.addSpefi(newSpefi);
            result = Math.max(result, myWindow.getPerf());
        }
        return result;
    }

    class Window {
        int size = 0;
        LinkedList<Spefi> que = null;

        int totalSpeed, minEffi;

        public Window(int size) {
            this.size = size;
            this.que = new LinkedList<>();
            totalSpeed = 0;
            minEffi = 0;
        }

        public void removeOne() {
            var spefi = que.remove();
            totalSpeed = totalSpeed - spefi.speed;
        }

        public void addSpefi(Spefi o) {
            this.que.add(o);
            totalSpeed += o.speed;
        }

        //todo : implement, later => minHeap
        public int getMinEffi() {
            int minOne = Integer.MAX_VALUE;
            for (int i = 0; i < que.size(); i++) {
                minOne = Math.min(minOne, que.get(i).effi);
            }
            return minOne;
        }

        public int getPerf() {
            int perf = totalSpeed * getMinEffi();
            return perf;
        }

    }

    class Spefi implements Comparable<Spefi> {
        int speed, effi;

        public Spefi(int speed, int effi) {
            this.speed = speed;
            this.effi = effi;
        }

        @Override
        public int compareTo(Spefi other) {
            if (other.speed > this.speed) return 1;
            else if (other.speed == this.speed) return 0;
            return -1;
        }
    }

}
