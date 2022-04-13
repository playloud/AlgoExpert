//https://www.algoexpert.io/questions/Group%20Anagrams
package com.psh.algoexpert.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {

        var map = new HashMap<String, ArrayList<String>>();
        for (String word : words) {
            var key = Stream.of(word.split("")).sorted().collect(Collectors.joining());
            if(map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                var arrList = new ArrayList<String>();
                arrList.add(word);
                map.put(key, arrList);
            }
        }

        var result = new ArrayList<ArrayList<String>>();
        for (String key: map.keySet()) {
            result.add(map.get(key));
        }
        return (List) result;
    }
}
