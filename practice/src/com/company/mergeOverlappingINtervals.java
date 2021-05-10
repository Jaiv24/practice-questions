package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverlappingINtervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sortedInterval = intervals.clone();
        Arrays.sort(sortedInterval, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> mergerInterval = new ArrayList<int[]>();
        int[] currentInterval = sortedInterval[0];
        mergerInterval.add(currentInterval);
        for (int[] nextInterval : sortedInterval){
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalEnd = nextInterval[1];
            int nextIntervalStart = nextInterval[0];
            if (currentIntervalEnd >= nextIntervalStart){
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            }
            else{
                currentInterval = nextInterval;
                mergerInterval.add(currentInterval);
            }

        }
        return mergerInterval.toArray(new int[mergerInterval.size()][]);
    }
}
