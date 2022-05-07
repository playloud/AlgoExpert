//https://www.algoexpert.io/questions/Laptop%20Rentals
package com.psh.algoexpert.heaps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
public class LaptopRentals {
    public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        var allRentals = new ArrayList<Rental>();
        // build rentals
        for (ArrayList<Integer> time : times) {
            var r = new Rental(time.get(0), time.get(1));
            allRentals.add(r);
        }
        // sort rentals
        var sortedRentals = allRentals.stream().sorted(new RentalComp()).collect(Collectors.toList());
        // calculate rentals
        int rentalCount = 0;
        while (sortedRentals.size() > 0) {
            var tempArr = new ArrayList<Integer>();
            rentalCount++;
            tempArr.add(0);
            Rental cursor = sortedRentals.get(0);
            for (int i = 0; i < sortedRentals.size(); i++) {
                Rental comp = sortedRentals.get(i);
                if(cursor == comp) continue;
                if(!cursor.isOverlapped(comp)) {
                    cursor = comp;
                    tempArr.add(i);
                }
            }
            System.out.println(String.format("group : %s", tempArr.toString()));
            tempArr.sort(Comparator.reverseOrder());
            for (int i : tempArr) {
                sortedRentals.remove(i);
            }
        }
        return rentalCount;
    }
}

class RentalComp implements Comparator<Rental> {
    @Override
    public int compare(Rental r1, Rental r2) {
        if(r1.start < r2.start) {
            return -1;
        } else if (r1.start == r2.start) {
            if(r1.duration < r2.duration) {
                return -1;
            } else if(r1.duration == r2.duration) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}

class Rental {
    int start = 0; int end = 0; int duration = 0;
    public Rental(int s, int e) {
        this.start = s;
        this.end = e;
        this.duration = (e-s);
    }
    public boolean isOverlapped(Rental other) {

        if(other.start < this.start && this.start < other.end) return true;
        if(other.start < this.end && this.end < other.end) return true;

        if(start < other.start && other.start < this.end) return true;
        if(this.start < other.end && other.end < this.end) return true;

        if(start == other.start && end == other.end) return true;

        return false;
    }
}
