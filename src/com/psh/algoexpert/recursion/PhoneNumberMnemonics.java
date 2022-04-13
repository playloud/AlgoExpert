package com.psh.algoexpert.recursion;

import java.util.*;

public class PhoneNumberMnemonics {

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        var result = new ArrayList<String>();
        if(phoneNumber !=null && phoneNumber.length() > 0)
            findAllMnemonics(0, "", phoneNumber.toCharArray(), result);
        return result;
    }

    public void findAllMnemonics(int startIndex, String curStr, char[] src, ArrayList<String> results) {
        char[] chars = getChar(src[startIndex]);
        for (char c : chars) {
            if( startIndex+1 < src.length) {
                findAllMnemonics((startIndex+1), curStr+c, src, results);
            } else {
                results.add(curStr+c);
            }
        }
    }

    public char[] getChar(char c) {
        switch (c){
            case '0':
                char[] sresult =  {'0'};
                return sresult;
            case '1':
                char[] sresult1 =  {'1'};
                return sresult1;
            case '2':
                char[] sresult2 =  {'a','b','c'};
                return sresult2;
            case '3':
                char[] sresult3 =  {'d','e','f'};
                return sresult3;
            case '4':
                char[] sresult4 =  {'g','h','i'};
                return sresult4;
            case '5':
                char[] sresult5 =  {'j','k','l'};
                return sresult5;
            case '6':
                char[] sresult6 =  {'m','n','o'};
                return sresult6;
            case '7':
                char[] sresult7 =  {'p','q','r','s'};
                return sresult7;
            case '8':
                char[] sresult8 =  {'t','u','v'};
                return sresult8;
            case '9':
                char[] sresult9 =  {'w','x','y','z'};
                return sresult9;
        }
        return null;
    }
}
