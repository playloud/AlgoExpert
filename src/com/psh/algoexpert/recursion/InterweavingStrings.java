package com.psh.algoexpert.recursion;

public class InterweavingStrings {
    static boolean globalResult = false;
    public static boolean interweavingStrings(String one, String two, String three) {
        globalResult = false;
        if((one.length() + two.length()) != three.length()) return false;
        char[] src1 = one.toCharArray();
        char[] src2 = two.toCharArray();
        var sbuf = new StringBuffer();
        mySol(src1, src2, 0, 0, sbuf, three);

        return globalResult;
    }

    public static void mySol(char[] src1, char[] src2, int index1, int index2, StringBuffer sbuf, String target) {

        if(sbuf.length() > 0 && sbuf.length() < target.length()) {
            if(!target.startsWith(sbuf.toString())) return;
        } else if(sbuf.length() == target.length()) {
            if(target.equals(sbuf.toString())) globalResult = true;
            return;
        }

        if(index1 < src1.length) {
            char c1 = src1[index1];
            sbuf.append(c1);
            mySol(src1, src2, (index1+1), index2, sbuf, target );
            sbuf.deleteCharAt(sbuf.length()-1);
        }

        if(index2 < src2.length) {
            char c2 = src2[index2];
            sbuf.append(c2);
            mySol(src1, src2, index1, (index2+1), sbuf, target);
            sbuf.deleteCharAt(sbuf.length()-1);
        }

    }
}
