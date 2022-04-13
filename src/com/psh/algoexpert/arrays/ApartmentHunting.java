package com.psh.algoexpert.arrays;
import java.util.*;
public class ApartmentHunting {
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {

        var allReqScores = new ArrayList<ReqScore>();

        for (int blockIndex = 0; blockIndex < blocks.size(); blockIndex++) {
            var reqScore = new ReqScore(reqs.length, blockIndex);
            for (int reqIndex = 0; reqIndex < reqs.length; reqIndex++) {
                String req = reqs[reqIndex];
                int score = getReq(blockIndex, req, blocks);
                reqScore.scores[reqIndex] = score;
            }
            allReqScores.add(reqScore);
        }
        // now order by scores
        allReqScores.sort(new Comparator<ReqScore>() {
            @Override
            public int compare(ReqScore o1, ReqScore o2) {
                if(o1.getSmallMax() >= o2.getSmallMax()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return allReqScores.get(0).blockIndex;
    }

    // return distance
    public static int getReq(int startBlockIndex, String req, List<Map<String,Boolean>> blocks) {
        int i,j;

        i = j = startBlockIndex;
        while(i> 0 || j < blocks.size()) {

            if(i > 0 && blocks.get(i).get(req)) {
                return Math.abs(startBlockIndex - i);
            } else {
                i--;
            }

            if(j < blocks.size() && blocks.get(j).get(req)) {
                return Math.abs(startBlockIndex - j);
            } else {
                j++;
            }
        }
        return -1;
    }

    public static class ReqScore {
        int[] scores = null;
        int blockIndex;
        public ReqScore(int count, int blockIndex) {
            scores = new int[count];
            this.blockIndex = blockIndex;
        }

        // finding smallest max
        public int getSmallMax() {
            return Math.max(scores[2], Math.max(scores[0], scores[1]));
        }
    }
}
