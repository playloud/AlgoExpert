package com.psh.algoexpert.strings;

public class RunLengthEncoding {

    public String runLengthEncoding(String str) {
        StringBuffer sbuf = new StringBuffer();

        char[] arr = str.toCharArray();
        outer: for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int count = 1;

            for (int j = i+1; j <= arr.length; j++) {
                if(j == arr.length) {
                    sbuf.append(String.format("%d%c", count, c));
                    break outer;
                } else if (c == arr[j]) {
                    count++;
                    if(count == 9) {
                        sbuf.append(String.format("%d%c", count, c));
                        i = j;
                        break;
                    }
                } else {
                    sbuf.append(String.format("%d%c", count, c));
                    i = j-1;
                    break;
                }
            }
        }
        return sbuf.toString();
    }

}
