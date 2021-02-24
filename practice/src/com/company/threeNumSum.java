package com.company;

import java.util.*;

public class threeNumSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length-2; i++) {
            int left = i+1;
            int right = array.length - 1;
            while (left < right){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    Integer[] triplets = {array[i], array[left], array[right]};
                    result.add(triplets);
                    left++;
                    right--;
                }
                else if(currentSum < targetSum){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}
