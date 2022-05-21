package com.psh.algoexpert.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ContinuousMedian {
    static class ContinuousMedianHandler {
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        double median = 0;

        public void insert(int number) {
            if (maxQ.size() == 0) {
                maxQ.add(number);
            } else {
                if (number < maxQ.peek())
                    maxQ.add(number);
                else
                    minQ.add(number);
            }
            rebalanceQ();
            System.out.println("maxq" + maxQ);
            System.out.println("minq" + minQ);
            int currentSize = minQ.size() + maxQ.size();

            if (minQ.size() + maxQ.size() == 1) {
                median = minQ.size() == 1 ? minQ.peek() : 0 + maxQ.size() == 1 ? maxQ.peek() : 0;
            } else {
                if (currentSize % 2 == 0) {
                    median = (double) (((double) minQ.peek() + (double) maxQ.peek()) / 2);
                } else {
                    if (minQ.size() > maxQ.size())
                        median = (double) minQ.peek();
                    else
                        median = (double) maxQ.peek();
                }
            }
        }

        public void rebalanceQ() {
            if (minQ.size() - maxQ.size() == 2) {
                maxQ.add(minQ.remove());
            } else if (maxQ.size() - minQ.size() == 2) {
                minQ.add(maxQ.remove());
            }
        }

        public double getMedian() {
            return median;
        }


        double median_incorrect = 0;
        ArrayList<Integer> arr_incorrect = new ArrayList<>();
        public void insert_incorrect(int number) {
            if (arr_incorrect.size() == 0) {
                arr_incorrect.add(number);
                median_incorrect = number;
            } else {
                System.out.println(arr_incorrect);
                int start = 0;
                int end = arr_incorrect.size() - 1;
                int n = 0;
                // sort and put
                arr_incorrect.add(number);
                arr_incorrect.sort(Comparator.naturalOrder());
                if (arr_incorrect.size() % 2 == 0) {
                    int temp = arr_incorrect.size() / 2;
                    median_incorrect = (double) (arr_incorrect.get(temp - 1) + (double) arr_incorrect.get(temp)) / 2;
                } else {
                    median_incorrect = (double) arr_incorrect.get((arr_incorrect.size() / 2));
                }
            }
        }
        public double getMedian_incorrect() {
            return median_incorrect;
        }
    }
}
