package com.psh.algoexpert.stacks;

import java.util.ArrayList;

public class ShortenPath {

    public static String shortenPath(String path) {
        boolean isRootStart = path.startsWith("/");
        String[] arr = path.split("/");
        var resultArr = new ArrayList<String>();
        for (String str : arr) {
            if(str.equals("..")) {
                if(resultArr.size() > 0) {
                    String last = resultArr.get(resultArr.size()-1);
                    if(last.equals("..")) {
                        resultArr.add(str);
                    } else {
                        resultArr.remove(resultArr.size()-1);
                    }
                } else {
                    if(!isRootStart)
                        resultArr.add(str);
                }
            } else if(str.trim().equals("") || str.equals(".")) {
                // do nothing
            } else {
                resultArr.add(str);
            }
        }
        String[] temp = new String[resultArr.size()];
        temp = resultArr.toArray(temp);
        String finalResult = null;
        if(isRootStart)
            finalResult = "/"+String.join("/", temp);
        else
            finalResult = String.join("/", temp);
        return finalResult;
    }

}
