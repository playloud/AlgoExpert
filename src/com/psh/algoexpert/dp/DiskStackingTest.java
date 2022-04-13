package com.psh.algoexpert.dp;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DiskStackingTest {

    @Test
    public void testDiskStack01() {
        var disks = new ArrayList<Integer[]>();
        disks.add(new Integer[]{2, 1, 2});
        disks.add(new Integer[]{3, 2, 3});
        disks.add(new Integer[]{2, 2, 8});
        disks.add(new Integer[]{2, 3, 4});
        disks.add(new Integer[]{1, 3, 1});
        disks.add(new Integer[]{4, 4, 5});
        DiskStacking.diskStacking(disks);

    }

    @Test
    public void testDiskStack02() {
        var disks = new ArrayList<Integer[]>();
        disks.add(new Integer[]{2, 1, 2});
        disks.add(new Integer[]{3, 2, 3});
        disks.add(new Integer[]{2, 2, 8});
        disks.add(new Integer[]{2, 3, 4});
        disks.add(new Integer[]{2, 2, 1});
        disks.add(new Integer[]{4, 4, 5});
        var result = DiskStacking.diskStacking(disks);
        for (Integer[] integers : result) {
            System.out.println();
        }
    }

    @Test
    public void testDiskStack03() {
        var disks = new ArrayList<Integer[]>();
        disks.add(new Integer[]{2, 1, 2});
        disks.add(new Integer[]{3, 2, 3});
        disks.add(new Integer[]{2, 2, 8});
        disks.add(new Integer[]{2, 3, 4});
        disks.add(new Integer[]{1, 2, 1});
        disks.add(new Integer[]{4, 4, 5});
        disks.add(new Integer[]{1, 1, 4});
        var result = DiskStacking.diskStacking(disks);
        for (Integer[] integers : result) {
            System.out.println();
        }

    }

}