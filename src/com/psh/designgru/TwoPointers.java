package com.psh.designgru;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class TwoPointers {

    @Test
    public void testTwoPointers() {
        var arr = getRandArr(20, 100);
        System.out.println(Arrays.toString(arr));
        //int target = arr[5] + arr[6] + 1;
        int target = arr[5] + arr[6];

        // do two pointer
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1;
        boolean isFound = false;
        while (start < end) {
            int temp = arr[start] + arr[end];
            if (temp == target) {
                System.out.println("found:" + temp + " " + target);
                System.out.println(String.format("%d %d", start, end));
                isFound = true;
                break;
            } else if (temp < target) {
                start++;
            } else {
                end--;
            }
        }
        if (!isFound) System.out.println("not found");
    }

    public int[] getRandArr(int size, int maxValue) {
        var rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(maxValue);
        }
        return result;
    }

    @Test
    public void testTripletSum() {
        // find zero of three sum
        int[] input = {-3, 0, 1, 2, -1, 1, -2};
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            int cur = input[i];
            int target = cur * -1;
            int left = 0, right = input.length -1;
            while(left < right) {
                int temp = input[left] + input[right];
                if(temp == target) {
                    if(left != i && right != i) {
                        //bingo
                        System.out.println(String.format("%d %d %d (%d %d %d)", i, left, right, input[i], input[left], input[right]));
                        break;
                    } else {
                        break;
                    }
                } else if(temp < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    @Test
    public void testHashSet() {
        class Some {
            public Some(int a, int b) {
                this.a = a;
                this.b = b;
            }
            int a,b;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Some some = (Some) o;
                return a == some.a && b == some.b;
            }

            @Override
            public int hashCode() {
                return Objects.hash(a, b);
            }
        }

        var mySet = new HashSet<Some>();
        mySet.add(new Some(0,1));
        var temp = new Some(0,1);
        System.out.println(mySet.contains(temp));
    }
}
