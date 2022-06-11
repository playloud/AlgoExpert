package com.psh.leetcode.amazon;
import java.util.*;
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        var result = new ArrayList<Integer>();

        int sd = 0, sLeng = 0;
        char[] lowArr = (low+"").toCharArray();
        sd = Integer.parseInt(lowArr[0]+"");
        sLeng = lowArr.length;
        var sbuf = new StringBuffer();

        while(true) {
            sbuf.delete(0, sbuf.length());
            //build number
            for (int i = 0; i < sLeng; i++) {
                int t = sd + i;
                sbuf.append(t);
                if(t == 9) {
//                    sLeng++;
//                    sd = 1;
                    break;
                }
            }
            int current = Integer.parseInt(sbuf.toString());
            if(low <= current && current <= high) {
                if(result.size() == 0 || (result.size() > 0 && result.get(result.size()-1) < current)) {
                    //System.out.println(current);
                    result.add(current);
                    if(sbuf.charAt(sbuf.length()-1) == '9') {
                        sLeng++;
                        sd = 1;
                    } else {
                        sd++;
                    }
                }
            } else if(current>high) {
                break;
            } else {
                if(sd == 9) {
                    sd = 1;
                    sLeng++;
                } else {
                    sd++;
                }
            }
            if(sbuf.toString().equals("123456789")) break;
        }
        return result;
    }

}
