package com.psh.algoexpert.sorting;
import java.util.*;
public class RadixSort {
    ArrayList<Integer> digits = new ArrayList<>();
    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {

        // determin maxDigitCount
        int maxDigitCount = 0;
        for (Integer n : array) {
            var eachDigits = getDigit(n);
            if(maxDigitCount<eachDigits.size())
                maxDigitCount = eachDigits.size();
        }

        // build buffer
        // index : current digits
        ArrayList<Integer>[] buf = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            buf[i] = new ArrayList<Integer>();
        }

        for (int radix = 0; radix<=maxDigitCount; radix++) {

            for (int i = 0; i < array.size(); i++) {
                int src = array.get(i);
                buf[getDigit(src, radix)].add(src);
            }

            array.clear();
            // maintaining order
            for (int i = 0; i < buf.length; i++) {
                array.addAll(buf[i]);
            }
            //debugging purpose
            //System.out.println(array);

            // buffer clear
            for (int i = 0; i < buf.length; i++) {
                buf[i].clear();
            }
        }

        return array;
    }

    public int getDigit(int src, int n) {
        digits.clear();
        int ret = 0;
        while(src > 0) {
            ret = src % 10;
            digits.add(ret);
            src = src / 10;
        }
        if(n >= digits.size())
            return 0;
        return digits.get(n);
    }

    public ArrayList<Integer> getDigit(int src) {
        digits.clear();
        int ret = 0;
        while(src > 0) {
            ret = src % 10;
            digits.add(ret);
            src = src / 10;
        }
        return digits;
    }

}
