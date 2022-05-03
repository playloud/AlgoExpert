package com.psh.algoexpert.strings;

import java.util.ArrayDeque;

public class PatternMatcher {
    public static String[] patternMatcher(String pattern, String str) {
        boolean isInversion = false;
        if(pattern.startsWith("y")){
            pattern = pattern.replace('y', 'a');
            pattern = pattern.replace('x', 'y');
            pattern = pattern.replace('a', 'x');
            isInversion = true;
        }

        int countX = 0;
        int countY = 0;
        char[] pats = pattern.toCharArray();
        for (char pat : pats) {
            if(pat == 'x') countX++;
            if(pat == 'y') countY++;
        }
        String resultX = null;
        String resultY = null;
        char[] src = str.toCharArray();
        // getting one sub.
        for (int i = 1; i <= src.length; i++) {
            String xMaybe = str.substring(0, i);
            String yMaybe = checkY(pats, src, xMaybe, countX, countY);
            if(yMaybe != null) {
                //System.out.println(String.format("%s %s", xMaybe, yMaybe));
                resultX = xMaybe;
                resultY = yMaybe;
                break;
            }
        }
        String[] results = new String[2];
        if(resultX == null && resultY == null) {
            return new String[] {};
        }
        if(isInversion) {
            results[1] = resultX;
            results[0] = resultY;
        } else {
            results[0] = resultX;
            results[1] = resultY;
        }

        return results;
    }

    public static String checkY(char[] pats, char[] src, String x ,int xCnt, int yCnt) {
        var srcQ = new ArrayDeque<Character>();
        for (char c : src) {
            srcQ.add(c);
        }
        int xLength = x.length();
        int yLength = 0;
        if(yCnt > 0)
            yLength = (src.length - xLength * xCnt) / yCnt;
        var xQ = new ArrayDeque<String>();
        var yQ = new ArrayDeque<String>();
        var buf = new StringBuffer();

        if( (xLength*xCnt) + (yCnt*yLength)  != src.length) return null;
        //System.out.println(x);
        for (int i = 0; i < pats.length; i++) {
            if(pats[i] == 'x'){
                // remove
                for (int j = 0; j < xLength; j++) {
                    if(srcQ.size() == 0) return null;
                    buf.append(srcQ.remove());
                }
                String curX = buf.toString();
                if(xQ.size() > 0 && !xQ.peek().equals(curX))
                    return null;
                else {
                    xQ.add(curX);
                    buf.delete(0, buf.length());
                }

            } else if(pats[i] == 'y') {
                // remove
                for (int j = 0; j < yLength; j++) {
                    if(srcQ.size() == 0) return null;
                    buf.append(srcQ.remove());
                }
                String curY = buf.toString();
                if(yQ.size() > 0 && !yQ.peek().equals(curY))
                    return null;
                else {
                    yQ.add(curY);
                    buf.delete(0, buf.length());
                }
            }
        }
        if(yCnt > 0)
            return yQ.getFirst();
        else{
            return "";
        }
    }




}
