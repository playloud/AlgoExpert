package com.psh.algoexpert.recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class GenerateDivTags {

    String opening = "<div>";
    String closing = "</div>";
    public ArrayList<String> generateDivTags_incorrect(int numberOfTags) {
        var result = new ArrayList<String>();
        var history = new HashSet<String>();
        getDivs("", numberOfTags, result, history);
        return result;
    }

    public void getDivs(String str, int remainingTags, ArrayList<String> result, HashSet<String> history) {
        if(remainingTags == 0) {
            //result.add(str);
            if(!history.contains(str)){
                history.add(str);
                result.add(str);
            }
            return;
        }
        // left
        String next1 = String.format("%s%s%s", opening, closing, str);
        getDivs(next1, (remainingTags-1), result, history);
        // wrap
        String next2 = String.format("%s%s%s", opening, str, closing);
        getDivs(next2, (remainingTags-1), result, history);
        // right
        String next3 = String.format("%s%s%s", str, opening, closing);
        getDivs(next3, (remainingTags-1), result, history);
    }

    public ArrayList<String> generateDivTags(int numberOfTags) {
        var result = new ArrayList<String>();
        var history = new HashSet<String>();
        getDivs2(numberOfTags, numberOfTags, "", result, history);
        return result;
    }

    public void getDivs2(int numL, int numR, String str, ArrayList<String> result, HashSet<String> history) {
        String next = null;

        if(numL > 0) {
            next = opening+str;
            getDivs2(numL-1, numR, next, result, history);

            next = str+opening;
            getDivs2(numL-1, numR, next, result, history);
        }

        if(numL < numR) {
            next = str+closing;
            getDivs2(numL, numR-1, next, result, history);
        }

        if(numL == 0 && numR == 0) {
            if(!history.contains(str)){
                history.add(str);
                result.add(str);
            }
            return;
        }
    }

}
