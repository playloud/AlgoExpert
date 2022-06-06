package com.psh.codesignal;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test01 {


    int[] solution(int[] balances, String[] requests) {

        // requests => list of trax
        var traxList = new ArrayList<Trax>();
        for (String request : requests) {
            traxList.add(new Trax(request));
        }

        var withrawList = new ArrayList<Trax>();

        // apply them
        for (Trax trax : traxList) {
            trax.apply(balances, withrawList);
        }

        return balances;
    }

    class Trax {
        String command = null;
        String traxType = null; // 0: withdraw, 1: deposit
        Date traxDt = null;
        int userId = 0;
        int amount = 0;
        boolean isCashbackDone = false;
        boolean isWithdraw = false;

        public Trax(String command) {
            this.command = command;
            String[] elements = command.split(" ");
            this.traxType = elements[0];
            int timestamp = Integer.parseInt(elements[1]);
            this.traxDt = new Date(timestamp);
            this.userId = Integer.parseInt(elements[2]);
            this.amount = Integer.parseInt(elements[3]);
        }

        public void apply(int[] balances, ArrayList<Trax> withdrawTrax) {
            if(this.traxType.equals("withdraw")) {
                if(balances[this.userId-1] >= this.amount ){
                    balances[this.userId-1] = balances[this.userId-1] - this.amount;
                    withdrawTrax.add(this);
                }
            } else {
                balances[this.userId-1] = balances[this.userId-1] + this.amount;
            }

            applyCashback(balances, withdrawTrax);
            System.out.println("du "+balances[0] + " "+balances[1]);
        }

        public void applyCashback(int[] balances, ArrayList<Trax> withdrawTrax) {
            for (Trax trax : withdrawTrax) {
                if(trax == this) continue;
                if(trax.isCashbackDone == false && isOver24Hours(trax.traxDt)) {
                    //calculate interest
                    double cashBack = (trax.amount * 0.02);
                    System.out.println();
                    System.out.println(this.traxDt + "==>" + trax.traxDt);
                    System.out.println(trax.amount+"==>"+(int)cashBack);

                    balances[trax.userId-1] = balances[trax.userId-1] + (int)cashBack;
                    trax.isCashbackDone = true;
                }
            }
        }

        public boolean isOver24Hours(Date otherOldDt) {
            long diffInMillies = Math.abs(this.traxDt.getTime() - otherOldDt.getTime());
            long diff = diffInMillies / (60 * 60 * 1000);
            if(diff>=24) return true;
            return false;
        }

    }

}
