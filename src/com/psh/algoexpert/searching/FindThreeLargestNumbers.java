package com.psh.algoexpert.searching;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] result = new int[3];
        int a,b,c;
        int _a,_b;
        boolean isUpdated_a = false;
        boolean isUpdated_b = false;

        a = b = c = Integer.MIN_VALUE;
        _a = _b = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            isUpdated_a = isUpdated_b = false;
            int value = array[i];
            if(value > a) {
                _a = a;
                isUpdated_a = true;
                a = value;
            }

            if(isUpdated_a) {
                _b = b;
                isUpdated_b = true;
                b = _a;
            } else if(b < value) {
                _b = b;
                isUpdated_b = true;
                b = value;
            }

            if(isUpdated_b) {
                c = _b;
            } else if(c < value) {
                c = value;
            }
        }

        result[0] = c;
        result[1] = b;
        result[2] = a;

        return result;

    }

    public static int[] findThreeLargestNumbers_old(int[] array) {

        var numberList = new ArrayList<Integer>();

        //numberList.add(Integer.MIN_VALUE);

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            //putNumber(value,numberList, 3);
            maintainBiggest(value, numberList, 3);
        }
        int[] result = new int[3];
        result[0] = numberList.get(0);
        result[1] = numberList.get(1);
        result[2] = numberList.get(2);

        return result;
    }

    public static void putNumber(int num, List<Integer> nums, int maxIndex) {
        if(nums.size() == 0) {
            nums.add(num);
            return;
        }
        for (int i = 0; i < nums.size(); i++) {

            if(maxIndex < i) {
                break;
            }

            if(nums.get(i) <= num) {
                nums.add(i, num);
                break;
            }
        }
        //System.out.println(nums);
    }

    public static void maintainBiggest(int num, List<Integer> nums, int maxCount) {

        if (nums.size() < maxCount) {
            nums.add(num);
            return;
        }

        // at least one of the item is smaller, delete it
        for (int e : nums) {
            if (e <= num) {
                nums.add(num);
                // getting smallest
                int smallest = getSmallest(nums);
                int firstIndex = nums.indexOf(smallest);
                System.out.println(nums);
                nums.remove(firstIndex);
                System.out.println(String.format("adding:%d   to delete:%d, index:%d", num, e, firstIndex));
                break;
            }
        }
    }

    public static int getSmallest(List<Integer> nums) {
        int smallest = Integer.MAX_VALUE;
        for (int e : nums) {
            smallest = Math.min(smallest, e);
        }
        return smallest;
    }
}
