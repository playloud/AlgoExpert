package com.psh.leetcode.citrix;
//https://leetcode.com/problems/find-all-groups-of-farmland/
//Runtime: 13 ms, faster than 73.49% of Java online submissions for Find All Groups of Farmland.
//Memory Usage: 132.1 MB, less than 36.15% of Java online submissions for Find All Groups of Farmland.
import java.util.*;

public class FindAllGroupsofFarmland {
    public int[][] findFarmland(int[][] land) {
        int[][] result = null;
        boolean[][] map = new boolean[land.length][land[0].length];
        var farms = new ArrayList<Farm>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (!map[i][j] && land[i][j] == 1) {
                    // start search farm
                    var farm = new Farm(i, j);
                    farms.add(farm);
                    searchFarm(i, j, map, farms, farm, land);
                }
            }
        }
        result = new int[farms.size()][];
        for (int i = 0; i < farms.size(); i++) {
            var f = farms.get(i);
            result[i] = new int[4];
            result[i][0] = f.i;
            result[i][1] = f.j;
            result[i][2] = f.a;
            result[i][3] = f.b;
        }
        return result;
    }

    public void searchFarm(int i, int j, boolean[][] map, ArrayList<Farm> farms, Farm farm, int[][] land) {

        if (i >= map.length || j >= map[0].length) return;

        if (map[i][j])
            return;
        else {
            //mark as occupied
            map[i][j] = true;
            // now update
            farm.add(i, j);
        }

        //go down
        if (i + 1 < map.length && land[i + 1][j] == 1) {
            searchFarm(i + 1, j, map, farms, farm, land);
        }

        //go right
        if (j + 1 < map[i].length && land[i][j + 1] == 1) {
            searchFarm(i, j + 1, map, farms, farm, land);
        }
    }

    class Farm {
        int i, j;
        int a, b;

        Farm(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public void add(int i, int j) {
            this.a = Math.max(i, this.a);
            this.b = Math.max(j, this.b);
        }
    }
}
