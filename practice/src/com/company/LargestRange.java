package com.company;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {
    public static int[] largestRange(int[] array){
        int [] bestRange = new int[2];
        int longestLength = 0;
        Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
        for (int num : array){
            nums.put(num, true);
        }
        for (int num : array){
            if(!nums.get(num)){
                continue;
            }
            nums.put(num, false);
            int currLength =1;
            int left = num-1, right = num +1 ;
            while (nums.containsKey(left)){
                nums.put(left, false);
                currLength++;
                left--;
            }
            while (nums.containsKey(right)){
                nums.put(right, false);
                currLength++;
                right++;
            }
            if (currLength > longestLength){
                longestLength = currLength;
                bestRange = new int[] {left+1, right-1};
            }
        }

        return bestRange;
    }
}
