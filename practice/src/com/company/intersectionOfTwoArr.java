package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersectionOfTwoArr {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hashset = new HashSet<>();
        for(int i : nums1){
            hashset.add(i);
        }
        List<Integer> arrList = new ArrayList<>();
        for(int i: nums2){
            if(hashset.contains(i)){
                arrList.add(i);
                hashset.remove(i);
            }

        }
        int[] val = new int[arrList.size()];
        for (int i=0; i<arrList.size(); i++){
            val[i] = arrList.get(i);
        }
        return val;
    }
}
