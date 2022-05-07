package com.psh.algoexpert.heaps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
public class ContinuousMedian {
    static class ContinuousMedianHandler {
        double median = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        public void insert(int number) {
            if (arr.size() == 0) {
                arr.add(number);
                median = number;
            } else {
                System.out.println(arr);
                int start = 0;
                int end = arr.size() -1;
                int n=0;
                // sort and put
                arr.add(number);
                arr.sort(Comparator.naturalOrder());
                if(arr.size() % 2 == 0) {
                    int temp = arr.size()/2;
                    median = (double) (arr.get(temp-1) + (double)arr.get(temp))/2;
                } else {
                    median = (double)arr.get((arr.size()/2));
                }

            }

        }

        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        double median2 = 0;
        public void insert2(int number) {
            if(maxQ.size() == 0) {
                maxQ.add(number);
            } else {
                if(number < maxQ.peek()) maxQ.add(number);
                else minQ.add(number);
            }
            rebalanceQ();
            System.out.println("maxq" + maxQ);
            System.out.println("minq" + minQ);
            int currentSize = minQ.size() + maxQ.size();

            if(minQ.size() + maxQ.size() == 1) {
                median2 = minQ.size() == 1? minQ.peek():0 + maxQ.size() == 1?maxQ.peek():0;
            } else {
                if(currentSize %2 == 0 ) {
                    median2 = (double) ( ((double) minQ.peek() + (double) maxQ.peek())/2);
                } else {
                    if(minQ.size() > maxQ.size())
                        median2 = (double)minQ.peek();
                    else
                        median2 = (double)maxQ.peek();
                }
            }
        }
        public double getMedian2() {
            return median2;
        }
        public void rebalanceQ() {
            if(minQ.size() - maxQ.size() == 2) {
                maxQ.add(minQ.remove());
            } else if (maxQ.size() - minQ.size() == 2) {
                minQ.add(maxQ.remove());
            }
        }
        public double getMedian() {
            return median;
        }
    }
}
