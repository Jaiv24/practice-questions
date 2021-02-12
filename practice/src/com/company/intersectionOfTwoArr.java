package com.company;

import java.util.HashSet;

public class intersectionOfTwoArr {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] b = new int[nums1.length];
        HashSet<Integer> hashset = new HashSet<>();
        for(int i : nums1){
            hashset.add(nums1[i]);
        }
        for(int i: nums2){
            if(hashset.contains(nums2[i])){
                b[i] = nums2[i];
            }

        }
        return b;
    }
}
