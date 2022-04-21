package com.psh.algoexpert.strings;

public class PatternMatcher {

    // PSH 04/16/22 : not completed
    public static String[] patternMatcher(String pattern, String str) {
//
        int countX = 0;
        int countY = 0;
        char[] pats = pattern.toCharArray();
        for (char pat : pats) {
            if(pat == 'x') countX++;
            if(pat == 'y') countY++;
        }

        char[] src = str.toCharArray();
        // getting one sub.

        var buf = new StringBuffer();
        for (int i = 0; i < src.length; i++) {
            for (int j = i; j < src.length; j++) {

            }
            String sub = buf.toString();
            int count = getSubCount(src, sub);
            if(count == countX) {
                String newSrc = str.replace(str, "");
                if(checkCountSub(newSrc, countY)) {
                    // then new combo found
                }
            }
        }


        return new String[] {};
    }

    private static boolean checkCountSub(String newSrc, int countY) {
        return false;
    }

    private static int getSubCount(char[] src, String sub) {
        return -1;
    }

}
