package com.psh.algoexpert.arrays;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class MinRewardsTest {

    @Test
    public void testMinRewards() {
        //int[] input = {8, 4, 2, 1, 3, 6, 7, 9, 5};
        //int[] input = {1};
        //int[] input = {5,10};
        //int[] input = {10, 5};
        //int[] input = {0, 4, 2, 1, 3};

        int[] input = {800, 400, 20, 10, 30, 61, 70, 90, 17, 21, 22, 13, 12, 11, 8, 4, 2, 1, 3, 6, 7, 9, 0, 68, 55, 67, 57, 60, 51, 661, 50, 65, 53}; //98
        var result = MinRewards.minRewards(input);
        System.out.println(result);

        int[] temp = {0, 1,2,3,4,5};
        System.out.println(Arrays.toString(temp));
//        System.arraycopy(temp,2, temp, 3, 2);
//        System.out.println(Arrays.toString(temp));

        var ll = new LinkedList<Integer>();
        for (int i : temp) {
            ll.add(i);
        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }
        System.out.println(ll);
        ll.add(1, ll.remove(4));
        System.out.println(ll);


    }

}