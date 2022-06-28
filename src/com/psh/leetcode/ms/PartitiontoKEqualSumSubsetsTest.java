package com.psh.leetcode.ms;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitiontoKEqualSumSubsetsTest {

    @Test
    public void test01() {
        var app = new PartitiontoKEqualSumSubsets();
        int[] input = {4,3,2,3,5,2,1};
        int k = 4;
        var result = app.canPartitionKSubsets(input, k);
        System.out.println(result);
    }

    @Test
    public void test02() {
        var app = new PartitiontoKEqualSumSubsets();
        int[] input = {1,2,3,4};
        int k = 3;
        var result = app.canPartitionKSubsets(input, k);
        System.out.println(result);
    }

    @Test
    public void test03() {
        //[4,4,6,2,3,8,10,2,10,7]
        //4
        var app = new PartitiontoKEqualSumSubsets();
        int[] input = {4,4,6,2,3,8,10,2,10,7};
        int k = 4;
        var result = app.canPartitionKSubsets(input, k);
        System.out.println(result);
    }

    @Test
    public void test04() {
        //[4,4,6,2,3,8,10,2,10,7]
        //4
        var app = new PartitiontoKEqualSumSubsets();
        int[] input = {730,580,401,659,5524,405,1601,3,383,4391,4485,1024,1175,1100,2299,3908};
        int k = 4;
        var result = app.canPartitionKSubsets(input, k);
        System.out.println(result);
    }

}