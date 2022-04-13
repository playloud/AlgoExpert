package com.psh.algoexpert.strings;

public class CaesarCipherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {

        String result = null;
        char[] arr = str.toCharArray();
        char[] resultArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            char n = (char)(c + key%26);
            if( n > 'z') {
                n = (char)((int)n - 26);
            }
            resultArr[i] = n;
        }

        result = new String(resultArr);

        return result;
    }
}
