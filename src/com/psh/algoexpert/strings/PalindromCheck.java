package com.psh.algoexpert.strings;

public class PalindromCheck {

    public static boolean isPalindrome(String str) {

        if(str == null || str.length() == 0)
            return false;
        if(str.length() == 1)
            return true;

        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while(i != j || (j-i) > 1 ) {
            if(arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
