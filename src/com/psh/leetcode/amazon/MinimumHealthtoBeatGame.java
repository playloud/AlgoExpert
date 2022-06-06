package com.psh.leetcode.amazon;
//https://leetcode.com/problems/minimum-health-to-beat-game/
public class MinimumHealthtoBeatGame {

    public long minimumHealth(int[] damage, int armor) {
        long minHealth = 0;
        int closeDamToArmnor = Integer.MIN_VALUE;
        boolean isFound = false;
        long sum = 0;
        for (int i = 0; i < damage.length; i++) {
            int dam = damage[i];
            if(!isFound && dam >= armor) {
                isFound = true;
            } else if(dam < armor){
                if(closeDamToArmnor < dam) {
                    closeDamToArmnor = dam;
                }
            }
            sum+=dam;
        }

        if(isFound) {
            minHealth = sum - armor + 1;
        } else {
            if(closeDamToArmnor == Integer.MIN_VALUE)
                closeDamToArmnor = 0;
            minHealth = sum - closeDamToArmnor +1;
        }

        return minHealth;
    }

}
