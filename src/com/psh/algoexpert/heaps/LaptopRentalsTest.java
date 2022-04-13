package com.psh.algoexpert.heaps;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LaptopRentalsTest {

    @Test
    public void testLaptopRentals() {
        var arr = new ArrayList<ArrayList<Integer>>();
//        arr.add(new ArrayList<Integer> (Arrays.asList(0,2)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(1,4)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(4,6)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(0, 4)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(7,8)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(9, 11)));
//        arr.add(new ArrayList<Integer> (Arrays.asList(3, 10)));

        arr.add(new ArrayList<Integer> (Arrays.asList(0,4)));
        arr.add(new ArrayList<Integer> (Arrays.asList(2,3)));
        arr.add(new ArrayList<Integer> (Arrays.asList(2,3)));
        arr.add(new ArrayList<Integer> (Arrays.asList(2,3)));

        var app = new LaptopRentals();
        var result = app.laptopRentals(arr);
        System.out.println(result);
    }


    @Test
    public void testArrList() {
        var arrList = new ArrayList<Integer>();

        arrList.add(4);arrList.add(6);arrList.add(9);
        arrList.add(2);arrList.add(2);arrList.add(1);
        arrList.add(35);

        // cause modification exception
        try {
            for (Integer integer : arrList) {
                arrList.remove(integer);
                System.out.println(arrList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //
        var sorted = arrList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println(arrList);

        var sorted2 = arrList.stream().sorted(new MyCustomCmp()).collect(Collectors.toList());
        System.out.println(sorted2);




    }
    class MyCustomCmp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {

            return o1;
        }
    }

}