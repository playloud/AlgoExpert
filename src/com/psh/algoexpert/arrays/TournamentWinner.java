package com.psh.algoexpert.arrays;
import java.util.*;

public class TournamentWinner {

    public String tournamentWinner( ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        String winner = null;
        int maxScore = Integer.MIN_VALUE;
        var map = new HashMap<String, Integer>();

        for (int i = 0; i < results.size(); i++) {
            int score = results.get(i);

            String home = null;
            String away = null;
            home = competitions.get(i).get(0);
            away = competitions.get(i).get(1);
            if(score == 0) { //away win
                if (map.containsKey(away)) {
                    map.put(away, (map.get(away)+3));
                } else {
                    map.put(away, (3));
                }
                if(maxScore < map.get(away)) {
                    maxScore = map.get(away);
                    winner = away;
                }
            } else { //home win
                if (map.containsKey(home)) {
                    map.put(home, (map.get(home)+3));
                } else {
                    map.put(home, (3));
                }
                if(maxScore < map.get(home)) {
                    maxScore = map.get(home);
                    winner = home;
                }
            }
        }
        return winner;
    }
}
